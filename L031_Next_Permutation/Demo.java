class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;
        while(i >=0 && nums[i] >= nums[i+1]){
            i--;
        }
        if(i>=0){
            int j = n -1;
            while(j>i && nums[j]<= nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);

    }

    private void swap(int[] nums, int low, int height) {
        int temp = nums[low];
        nums[low] = nums[height];
        nums[height] = temp;
    }
    private void reverse(int[] nums, int low, int height){
        while(low <height){
            swap(nums, low++, height--);
        }
    }
}