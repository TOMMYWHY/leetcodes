/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode current = dummy;
        while( current.next != null && current.next.next != null ){
            ListNode n1 = current.next;
            ListNode n2 = current.next.next;
            current.next = n2;
            n1.next = n2.next;
            n2.next = n1;
            current = n1; // 下一节点
        }
        return dummy.next;
    }
}