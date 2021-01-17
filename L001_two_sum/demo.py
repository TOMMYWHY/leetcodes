class Solution:
    def twoSum(self, nums, target):
        d = {}
        for i, n in enumerate(nums):
            # print(i,n)
            m = target - n
            if m in d :
                return (d[m],i)
            else:
                d[n]=i
            
            
            
nums = [2,7,11,15]
target = 9
t= Solution()
print(t.twoSum(nums,target))