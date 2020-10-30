#8. String to Integer (atoi)
# Input: str = "42"
# Output: 42


class Solution:
    def myAtoi(self, str: str) -> int:
        str = str.lstrip() #去掉空格
        if len(str) == 0 or (str[0].isdigit()==False and str[0] not in ['+','-']):
            return 0        
        res = str[0] # 加减号
        i = 1
        while i < len(str) and str[i].isdigit():
            res +=str[i]
            i +=1
        try:
            res = int(res)
            return max(min(res, 2**31 -1 ),-2**31)
        except:
            return 0
        

str = "4193 with words"
sol = Solution()
print(sol.myAtoi(str))