class Solution:
    def searchInsert01(self, nums: List[int], target: int) -> int:
        if target > nums[len(nums)-1]:
            return len(nums)
        
        for i in range(len(nums)):
            if nums[i] >=target:
                return i
        
    
    def searchInsert(self, nums: List[int], target: int) -> int:    
        l,r = 0, len(nums) -1
        while l <= r:
            mid = (l+r)//2
            if muns[mid] == target:
                return mid
            if nums[mid] < target:
                l = mid+1
            else:
                r = mid -1 
                
            return l
        
        