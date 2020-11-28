class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        start = -1
        max = 0
        d={}  # dic = {"a":1,}# char:index

        for i in range(len(s)):
            #s[i] in d....
            if s[i] in d and d[s[i]]>start:
                start = d[s[i]]
                d[s[i]] = i
                
            #s[i] not in d....
            else:
                d[s[i]] = i
                if i - start > max:
                    max = i - start
                    
        return max
    
    
s = "abcabcbb"    
sol = Solution()
print(sol.lengthOfLongestSubstring(s))
