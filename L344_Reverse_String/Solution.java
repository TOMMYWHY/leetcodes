class Solution {
    public void reverseString(char[] s) {
        if(s == null || s.length == 0) {
            return ;
        }    
        recursion(s, 0, s.length -1);
    }

    public void recursion(char[] s, int left, int right){
        if(left >= right){
            return ;
        }

        recursion(s,left+1,right-1);
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
    }


}