class Solution:
    def partition(self, s: str) -> List[List[str]]:
        res = []
        #code to check whether the  substring is palindrome or not
        def isPalindrome(s):
            return s[:]==s[::-1]
            
        def palindromePartitioning(index, s, ds):
            if index == len(s):
                res.append(ds[:])
                return
            for i in range(index,len(s)):
                if(isPalindrome(s[index:i+1])):
                    ds.append(s[index:i+1])
                    palindromePartitioning(i+1, s, ds) 
                    ds.pop()
        palindromePartitioning(0, s, [])
        return res
