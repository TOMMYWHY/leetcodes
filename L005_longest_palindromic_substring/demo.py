class Solution:
    def longestPalindrome(self, s: str) -> str:
        palindrome = ''
        for i in range(len(s)):
            len1 = len(self.expandAroundCenter(s,i,i))
            if len1 > len(palindrome):
                palindrome = self.expandAroundCenter(s,i,i)
            
            len2 = len(self.expandAroundCenter(s,i,i+1))
            if len2 > len(palindrome):
                palindrome = self.expandAroundCenter(s,i,i+1)
            
            
        return palindrome 
    
    def expandAroundCenter(self, s, l, r):
        while l>=0 and r<len(s) and s[l] == s[r]:
            l -=1
            r +=1
        
        return s[l+1:r]