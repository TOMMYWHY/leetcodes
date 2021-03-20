# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeElements(self, head: ListNode, val: int) -> ListNode:
        dummy =  ListNode(0)
        dummy.next = head
        pre = dummy
        while head is not None:
            if head.val==val:
                pre.next = head.next
            else:
                pre = head
            
            head = head.next
            
        return dummy.next