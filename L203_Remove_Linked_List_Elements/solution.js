/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} val
 * @return {ListNode}
 */
var removeElements = function(head, val) {
    
    let dummy =new ListNode(0);
    let pre = dummy;
    dummy.next = head;
    while(head !=null){
        if(head.val == val){
            pre.next = head.next;
            head = head.next;
        }else{
            pre = head
            head = head.next;

        }
    }
    return dummy.next
};

var removeElements = function(head, val) {
    let curr = head;
    let dummy = new ListNode(-1)
    dummy.next = curr;
    let prev = dummy;
    while (curr) {
        if (curr.val === val) prev.next = curr.next 
        else prev = curr;
        curr = curr.next 
    }
    return dummy.next;
};