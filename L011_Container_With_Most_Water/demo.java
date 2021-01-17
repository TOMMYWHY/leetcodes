/*
* 11. Container With Most Water
*/
class Demo{
    public static void main(String[] args) {
        int [] arr =  {1,8,6,2,5,4,8,3,7};
        Solution sol = new Solution();
        System.out.println(sol.maxArea(arr));
    }
}

class Solution {
    public int maxArea(int[] height) {
        int begin = 0,end = height.length-1;
        int res = 0;
        while(begin<end){
            res = Math.max(res,(end-begin)*Math.min(height[begin],height[end]));
            if(height[begin]<height[end]){
                begin ++;
            }else{
                end--;
            }

        }
        return res;
    }
}