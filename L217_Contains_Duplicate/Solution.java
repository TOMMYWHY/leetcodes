class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length==0) return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
            // map.put(nums[i],)
        }

        boolean res = false;
        for(int key: map.keySet()){
            if(map.get(key)>1){
                res = true;
            }
        }
        return res;
    }
}