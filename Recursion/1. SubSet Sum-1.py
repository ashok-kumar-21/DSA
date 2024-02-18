#User function Template for python3
class Solution:
	def subsetSums(self, arr, N):
		# code here
		res = []
		def subSetSumHelper(arr, sum, index):
		    if index == N:
		        res.append(sum)
		        return
		    subSetSumHelper(arr, sum + arr[index], index + 1)
		    subSetSumHelper(arr, sum, index+1)
		subSetSumHelper(arr,0,0)
		res.sort()
		return res
		        
