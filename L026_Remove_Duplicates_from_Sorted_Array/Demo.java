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


    public int removeDuplicates1(int[] nums) {
        if(nums.length == 0) return 0;
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            
            if(nums[i]!=nums[index]){
                index++;
                nums[index] = nums[i];
            }
            
        }
        
        return index+1;
    }
}