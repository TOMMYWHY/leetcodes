class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0; i< nums.length; i ++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;

            }
            
        }
        return k;
    }

    public int removeElement_1(int[] nums, int val) {
        int l = 0, r = nums.length-1;
        while(l<=r){
            if(nums[l]==val){
                nums[l] = nums[r];
                r--;
            }else{
                l++;
            }
        }
        return r+1;
    }
}