Class Demo{
    public static void main(String[] args) {
        
    }
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n-2; i++){
            if(nums[i]>0) break;
            if(i>0 && nums[i]==nums[i-1]) continue;
            int target = 0 - nums[i];
            int lo = i+1,hi=n-1;
            while(lo<hi){
                int tmpSum = nums[lo]+nums[hi];
                if(tmpSum == target){
                    res.add(Arrays.asList(
                        new Integer[]{
                            nums[i],
                            nums[lo],
                            nums[hi]
                        }
                        ));
                    lo++;
                    while(lo<hi && nums[lo]==nums[lo-1]){
                        lo++;
                    }
                    hi--; 
                    while(lo<hi && nums[hi]==nums[hi+1]){
                        hi--;
                    }   
                }else if(tmpSum < target){
                    lo++;
                }else if(tmpSum > target){
                    hi++;
                }
            }
        }
        return res;
    }
}