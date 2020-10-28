// Input: s = "PAYPALISHIRING", numRows = 3
// Output: "PAHNAPLSIIGYIR"




class Demo{
    public static void main(String[] args) {
        // System.out.println("lll");
        Solution sol = new Solution();
        String result = sol.convert("PAYPALISHIRING",3);
        System.out.println(result);
    }
}

class Solution {
    public String convert(String s, int numRows) {
        if (numRows <=1) return s;
        StringBuilder[] sb =new StringBuilder[numRows];
        for(int i =0; i <numRows;i++){
            sb[i]=new StringBuilder();//init collection
        }
        int index=0;
        while(index<s.length()){
            for(int i=0; i<numRows && index< s.length(); i++){
                sb[i].append(s.charAt(index));
                index++;
            }
            for(int i=numRows -2; i>0 && index<s.length(); i--){
                sb[i].append(s.charAt(index));
                index++;
            }
        }
        for(int i = 1; i< numRows; i++){
            sb[0].append(sb[i]); //将1 往后的全部append 到0 中
        }
        return sb[0].toString();
    }
    public String convert_2(String s, int numRows){
        if (numRows <=1) return s;
        List<StringBuilder> rows = new ArrayList<>();
        for(int i =0; i <Math.min(numRows,s.length());i++){
            rows.add(new StringBuilder());//init collection
        }
        int curRow=0;
        boolean goingDown = false; 
        for(char c: s.toCharArray()){
            rows.get(curRow).append(c);
            if(curRow == 0 || curRow == numRows -1){
                goingDown =!goingDown;
            }
            curRow += goingDown ? 1:-1;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder row : rows){
            res.append(row);
        }
        return res.toString();
    }
}