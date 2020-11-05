class Demo{
    public static void main(String[] args) {
        
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        if(strs.length ==0){return "";}
        if(strs.length ==1){return strs[0];}
        String first = strs[0];
        for(int i=1;i <first.length();i++){
            String prefix = first.substring(0,i);
            int count = 0;
            for(int j = 1; j<strs.length;j++){
                if(strs[j].indexOf(prefix)==0){
                    count = count +1;
                }
            }
            if(count !=0 && count ==strs.length-1){
                result = prefix;
            }
        }
        return result;

    }
}