class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // ArrayList<Integer> result = new ArrayList<>();
        int[] result = new int [nums1.length];
        Stack<Integer> stack1 = new Stack<>();

        for(int elm:nums2){
            stack1.push(elm);
        } 

        for(int i =0 ; i< nums1.length;i++){
            Stack<Integer> temp = new Stack<>();

            int max = -1;
            boolean isFound = false;
            while(!stack1.isEmpty() && isFound ==false){
                int top = stack1.pop();
                if(top > nums1[i]){
                    max = top;
                }else if(top == nums1[i]){
                    isFound = true;
                }
                temp.add(top);
            }
            // result.add(max);
            result[i] = max;
            
            while(!temp.isEmpty()){
                stack1.push(temp.pop());
            }
        }
        
        return result;
    }
}