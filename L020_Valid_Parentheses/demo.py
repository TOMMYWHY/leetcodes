class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        lookup = {
            "(" : ")",
            "[" : "]",
            "{" : "}"
        }
        
        for parenthese in s:
            if parenthese in lookup:
                stack.append(parenthese)
            elif len(stack == 0) or lookup[stack.pop()] != parenthese:
                return False
            
        return len(stack) == 0
    
    
    def isValid1(self, s: str) -> bool:
        
        