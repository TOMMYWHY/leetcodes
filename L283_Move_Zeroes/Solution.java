class Solution {
    public static void swap(int[]arr,int a,int b){
        int temp = arr[a];
        arr[a]  = arr[b];
        arr[b] = temp;
        
    }
    public void moveZeroes_v1(int[] nums) {
        for(int i = 0; i< nums.length ; i++){
            for(int j = 1; j< nums.length-i ; j++){
                if(nums[j-1]==0){
                    swap(nums,j,j-1);      
                }
                
            }
        }

    }

    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i = 0; i< nums.length ; i++){
            if(nums[i]!=0){
                nums[index] = nums[i];
                index ++;
            }
        }
        for(int i = index; i<nums.length;i++){
            nums[i]=0;
        }

    }

    public void moveZeroes_v2(int[] nums){
        for(int i=0; i<nums.length;i++){
            for(int j =1;j<nums.length-i;j++){
                if(nums[j-1]==0){
                    swap(nums,j,j-1)
                }
            }
           
        }
    }

    public void moveZeroes_v3(int[] nums){
        int index = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index] = nums[i];
                index ++
            }
        }
        for(int j = index;j<nums.length;j++){
            nums[j] =0;
        }
    }
    
}