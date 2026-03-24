# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dum = ListNode(-1,head)
        end = head
        prev = dum
        while n > 0 and end:
            end = end.next
            n -= 1

        while end:
            end = end.next
            prev = prev.next

        if prev.val == -1:
            return head.next
        else:
            prev.next = prev.next.next

        return head