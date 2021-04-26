class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        if nums is None or len(nums)==0:
            return 0
        
        count=0
        res = 0
        for item in nums:
            if item == 1:
                count +=1
            else:
                res = max(res,count)
                count = 0
        return max(res,count)
    
    def findMaxConsecutiveOnes_1(self, nums: List[int]) -> int:
        if nums is None or len(nums)==0:
            return 0
        count = 0
        result =0
        for item in nums:
            if item ==1:
                count +=1
            else:
                result=max(count,result)
                count = 0
                
        return max(count,result)
            