class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        if len(nums1) > len(nums2):
            nums1, nums2 = nums2, nums1
        leftSize = (len(nums1) + len(nums2) + 1) // 2
        low, high = 0, len(nums1)
        while low <= high:
            mid1 = (low + high) // 2
            mid2 = leftSize - mid1
            l1, l2, r1, r2 = -999999999999999, -9999999999999999, 99999999999999, 99999999999999999
            if mid1 < len(nums1):
                r1 = nums1[mid1]
            if mid2 < len(nums2):
                r2 = nums2[mid2]
            if mid1 > 0:
                l1 = nums1[mid1-1]
            if mid2 > 0:
                l2 = nums2[mid2-1]
            if l1 <= r2 and l2 <= r1:
                if (len(nums1) + len(nums2)) % 2 == 0:
                    return (max(l1, l2) + min(r1, r2)) / 2
                else:
                    return max(l1,l2)
            elif l1 > r2:
                high = mid1 - 1
            else:
                low = mid1 + 1
        return 0              
