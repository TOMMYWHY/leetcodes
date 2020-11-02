/*
* 9. Palindrome Number
*/ 



class Demo{
    public static void main(String[] args) {
        
    }
}

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int div = 1;
        int num = x;
        while(num/div >=10){
            div *=10; //确定数字长度
        }
        while(num!=0){
            int left = num/div;
            int right = num%10;
            if(left != right)return false;
            num = (num-left*div)/10; //去掉最高位和最低位
            div/=100;
        }
        return true;
    }
}