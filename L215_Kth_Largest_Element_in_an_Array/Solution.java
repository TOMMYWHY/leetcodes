class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap= new PriorityQueue<>(Collections.reverseOrder());

        for(int num:nums){
            heap.add(num);
        }
        Integer result = null;
        while(k>0){
            result =Integer.valueOf( heap.poll());
            k--;
        }

        return result.intValue();
    }
}