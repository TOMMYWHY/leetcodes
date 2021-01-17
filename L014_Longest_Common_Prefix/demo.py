class Solution:
    def longestCommonPrefix_1(self, strs: List[str]) -> str:
        if not strs:
            return ""
        
        for i in range(len(strs[0])):
            for string in strs[1:]:
                if i>=len(string) or string[i] != strs[0][i]  :
                    return strs[0][:i]
                
        return strs[0]
    
    def longestCommonPrefix_2(self, strs: List[str]) -> str:
        result = ""
        i = 0
        while True:
            try:
                sets = set(string[i] for string in strs )
                if len(sets) == 1:
                    result +=sets.pop()
                    i+=1
            except Exception as e :
                break
            
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if not strs:
            return ""
        length,count = len(strs[0]),len(strs)
        for i in  range (length):
            c = strs[0][i]
            if any(i==len(strs[j])or strs[j][i]!=c for j in range(1,count)  ) :
                return strs[0][:i]
        return strs[0]
            