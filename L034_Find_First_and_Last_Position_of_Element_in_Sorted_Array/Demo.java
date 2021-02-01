class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int left = findFirst(nums,target,n);
        int right = findLast(nums,target,n);
        return new int[]{left, right};

    }

    private int findFirst(int[] nums, int target,int n){
            int lo=0, hi=n-1;
            int index = -1;
            while(lo <= hi){
                int mid = lo + (hi-lo)/2;
                if(nums[mid]>=target){
                    hi = mid-1;
                }else{
                    lo = mid+1;
                }
                if(nums[mid]==target){
                    index = mid;
                }

            }
            return index;
    }
    private int findLast(int[] nums, int target,int n){
        int lo=0, hi=n-1;
        int index = -1;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid]<=target){
                lo = mid+1;
            }else{
                hi=mid-1;
            }
            if(nums[mid]==target){
                index = mid;
            }
        }
        return index;
    }

}