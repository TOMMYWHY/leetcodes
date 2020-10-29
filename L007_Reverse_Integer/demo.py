class Solution:
    def reverse(self, x: int) -> int:
        num = 0
        a = abs(x) #absolute
        while(a!=0):
            temp = a%10
            print("a",a)
            print("temp",temp)
            num = num * 10 + temp
            print("num",num)
            a = int(a/10)  
        
        if x>0 and num < 2147483647:
            return num
        elif x <0 and num <= 2147483647:
            return -num
        else:
            return 0
        
    def reverse_s(self,x:int)->int:
        a = abs(x) #absolute
        str_x = str(a)
        # print("str:",str_x)
        str_result=""
        str_result = str_x[::-1]
        # for i in str_x:
        #     print(i)
        #     str_result = "".join([i,str_result])
        
        num = int(str_result)
        
        if x>0 and num < 2147483647:
            return num
        elif x <0 and num <= 2147483647:
            return -num
        else:
            return 0


input = 123
sol=Solution()
# print(sol.reverse(123))
print(sol.reverse_s(123))