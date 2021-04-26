import java.util.*; 


class Solution {
    public int findMaxConsecutiveOnes_v1(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1 && nums[0]==1) return 1;
        if(nums.length == 1 && nums[0]==0) return 0;
        int res = 0;
        ArrayList<Integer> temps = new ArrayList<>(); 
        temps.add(0);
        for (int i = 0;i < nums.length;i++){
            if(nums[i]==1){
                res++;
            }else{
                temps.add(res);
                res=0;
            }
            
        }
        temps.add(res);
        // System.out.println(res);
        // System.out.println(temps.toString());
        return Collections.max(temps);
    }

    public int findMaxConsecutiveOnes_v2(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1 && nums[0]==1) return 1;
        if(nums.length == 1 && nums[0]==0) return 0;
        int res = 0;
        int temp = 0;
        for (int i = 0;i < nums.length;i++){
            if(nums[i]==1){
                temp++;
                if (res < temp ){ res = temp;}
            }else{
                if (res < temp ){ res = temp;}
                temp = 0;
            }
            
        }
        return res;
    }

    public int findMaxConsecutiveOnes_v3(int[] nums) {
        if(nums.length == 0 || nums==null) return 0;
        
        int count = 0;
        int result = 0;
        for (int i = 0;i < nums.length;i++){
            if(nums[i]==1){
                count++;
            }else{
                result = Math.max(result,count);
                count = 0;
            }
            
        }
        return Math.max(result,count);
    }

    public int findMaxConsecutiveOnes_v3(int[] nums) {
        if(nums.length == 0 || nums==null) return 0;
        int count=0;
        int result = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                count ++;
            }else{
                result = Math.max(count,result);
                count = 0; 
            }
        }
        return Math.max(count,result)
    }
}