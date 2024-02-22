class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        stack = []
        res = []
        map = {}
        for i in range(len(nums2) - 1, -1, -1):
            while len(stack) > 0 and stack[-1] <= nums2[i]:
                stack.pop()
            if len(stack) > 0:
                map[nums2[i]] = stack[-1]
            else:
                map[nums2[i]] = -1
            stack.append(nums2[i])
        for i in range(len(nums1)):
            res.append(map[nums1[i]])
        return res
