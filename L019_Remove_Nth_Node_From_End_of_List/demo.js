/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} n
 * @return {ListNode}
 */
var removeNthFromEnd = function(head, n) {
    let dummy = new ListNode();
    dummy.next = head;
    let n1 = dummy;
    let n2 = dummy;
    // n2 先动
    for (let i = 0; i <= n; i++) {
        n2 = n2.next;
    }
    //n2 n1 一起动，滑动窗口
    while(n2 !=null){
        n1 = n1.next;
        n2 = n2.next;
    }
    n1.next = n1.next.next;//remove
    return dummy.next;
};