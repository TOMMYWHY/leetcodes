/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
function ListNode(val, next) {
    this.val = (val===undefined ? 0 : val)
    this.next = (next===undefined ? null : next)
    }
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var mergeTwoLists = function(l1, l2) {
    let curr = new ListNode();  
    let dummy = curr; // 空节点
    while(l1 !== null && l2 !== null){
        if(l1.val < l2.val){
            curr.next = l1; // curr 的第二个节点开始存入 l1 or l2
            l1 = l1.next;
        }else{
            curr.next = l2;
            l2 = l2.next;
        }
        curr = curr.next;

    }
    if(l1 !== null ){
        curr.next = l1;
    }
    if(l2 !== null){
        curr.next = l2;
    }
    // curr = curr.next; 不需要~！！！
    return dummy.next;

};