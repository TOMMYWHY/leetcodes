# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class MyListNode:
    def __init__(self, l:ListNode):
        self.l = l
        
    def __eq__(self,other):
        return self.l.val == other.l.val
    def __lt__(self,other):
        return self.l.val < other.l.val
    
    

class Solution:
    def mergeKLists(self, lists: List[ListNode]) -> ListNode:
        
        dummyhead = ListNode(0)
        curr = dummyhead
        
        heap = [MyListNode(i) for i in lists if i]
        heapq.heapify(heap) # priority queue
        
        while heap:
            i = heapq.heappop(heap).l
            curr.next = ListNode(i.val)
            curr = curr.next
            
            if i.next :
                heapq.heappush(heap,MyListNode(i.next))
                
        return dummyhead.next
            
        
        