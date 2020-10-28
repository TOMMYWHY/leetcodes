
# Input: s = "PAYPALISHIRING", numRows = 4
# Output: "PINALSIGYAHRPI"
# P     I    N
# A   L S  I G
# Y A   H R
# P     I

class Demo.Demo.Demo.Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows == 1 or numRows >= len(s):
            return s
        
        row, step = 0,1
        zigzag = ['' for x in range(numRows)]
        for crct in s:
            zigzag[row] += crct
            if row == 0:
                step = 1
            elif row == numRows - 1:
                step = -1
                
            row += step
        
        return "".join(zigzag)
    
    
    
    
    
rows = 4
sol = Demo.Demo.Demo.Solution()
print(sol.convert("PAYPALISHIRING",rows))
