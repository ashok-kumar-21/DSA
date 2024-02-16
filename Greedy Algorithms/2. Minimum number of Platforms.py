class Solution:    
    #Function to find the minimum number of platforms required at the
    #railway station such that no train waits.
    def minimumPlatform(self,n,arr,dep):
        # code here
        arr.sort()
        dep.sort()
        platforms = 1
        res =1
        i=1
        j=0
        while i<n and j<n:
            if arr[i] > dep[j]:
                j+=1
                platforms-=1
            else:
                platforms+=1
                i+=1
            res = max(res,platforms)
        return res
