class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        res = []
        candidates.sort()
        def combinationSum2Helper(index, target, ds):
            if target == 0:
                res.append(ds[:])
                return
            for i in range(index, len(candidates)):
                if i > index and candidates[i] == candidates[i-1]:
                    continue
                if candidates[i] <= target:
                    ds.append(candidates[i])
                else:
                    break
                combinationSum2Helper(i+1, target - candidates[i],ds)
                ds.pop()
        combinationSum2Helper(0, target,[])
        return res
