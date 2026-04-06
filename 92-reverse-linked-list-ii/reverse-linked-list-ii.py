# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseBetween(self, head: Optional[ListNode], left: int, right: int) -> Optional[ListNode]:
        curr = head
        for i in range(right - left):
            curr = curr.next

        r = curr
        l = head
        past = None
        for i in range(left - 1):
            past = l
            l = l.next
            r = r.next

        fut = r.next
        curr = l
        while l != r:
            l = l.next
            curr.next = fut
            fut = curr
            curr = l
        
        l.next = fut
        if past:
            past.next = l
        else:
            head = l

        return head


        