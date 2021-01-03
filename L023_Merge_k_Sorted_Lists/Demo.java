class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        PriorityQueue <ListNode> pq = new PriorityQueue<>(
            (ListNode l1, ListNode l2)->(l1.val -l2.val)
        );

        for(ListNode list:lists){
            if(list != null){
                pq.offer(list);
            }
        }
        while(!pq.isEmpty()){
            ListNode next = pq.poll();
            cur.next = next;
            cur = cur.next;
            if(next.next != null){
                pq.offer(next.next);
            }
        }
        return  dummy.next;


    }
}

class Demo{
    public static void main(String[] args) {
        
    }
}