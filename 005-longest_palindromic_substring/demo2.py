class Solution:
    def longestPalindrome(self, s: str) -> str:
        
       pass
                
    def isPalindrome(self, s):
        n=len(s)
        for i in range(n//2+1):
            if s[i]!=s[n-i-1]:
                return False
        return True
    
    def isPalindrome_2 (self,l,r):
        while l<r:
            if s[l] != s[r]:
                return False
            l +=1
            r -=1
        return True


sol = Solution()
print(sol.isPalindrome("aba"))