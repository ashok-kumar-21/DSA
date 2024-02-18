class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        res = []
        def combinationSumHelper(index, target, ds):
            if index == len(candidates):
                if target == 0:
                    res.append(ds[:])
                return
            if(candidates[index] <= target):
                ds.append(candidates[index])
                combinationSumHelper(index, target - candidates[index], ds)
                ds.pop() 
            combinationSumHelper(index + 1, target, ds)
        combinationSumHelper(0, target, [])
        return res
# Pick Not Pick Approach
