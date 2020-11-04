class Demo{
    public static void main(String[] args) {
        
    }
}
class Solution {
    public int romanToInt(String s) {
        int result = 0;
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        if(s.length()==0){return 0;}
        char[] arr = s.toCharArray();
        int i =0 , j = 1;
        for(;i<arr.length-1;i++,j++){
            if(map.get(arr[i]) > map.get(arr[j]) ) {
                result +=map.get(arr[i]);
            }else{
                result -=map.get(arr[i]);
            }
        }
        result += map.get(arr[i]);
        return result;
    }
    
}