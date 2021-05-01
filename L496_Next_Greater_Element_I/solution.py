class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        result = []
        stack = []
        for num in nums2:
            stack.append(num)
            
        for num in nums1:
            max = -1
            isFound = False
            temp = []
            
            
            while (len(stack)!=0 and isFound==False):
                top = stack.pop()
                if top>num:
                    max=top
                elif top == num:
                    isFound = True
                temp.append(top)
            result.append(max)
            
            while len(temp)!=0:
                stack.append(temp.pop())
           
        return result