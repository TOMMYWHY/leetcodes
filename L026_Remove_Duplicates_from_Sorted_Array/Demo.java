class Solution {

    private void swap(int[] nums, int i, int j ){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int removeDuplicates(int[] nums) {
        int i =0, j=0;
        while(j<nums.length){
            while(j<nums.length && nums[j] == nums[i]){
                j++;
            }
            if(j<nums.length){
                i++;
                swap(nums,i, j);
                j++;
            }
        }
        return i+1;
    }
}