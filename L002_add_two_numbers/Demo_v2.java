
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        while(l1!=null || l2 !=null){
            int dig = l1.val +l2.val +carry;
            int val = dig%10;
            carry = dig/10;
            ListNode newnode = new ListNode(val);
            current.next= newnode;
            current = current.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        //while l1 !=null
        //while l2 !=null
    }
}