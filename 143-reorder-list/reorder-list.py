# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        """
        Do not return anything, modify head in-place instead.
        """
        slow = head
        fast = head
        prev = None

        while fast and fast.next:
            prev = slow
            slow = slow.next
            fast = fast.next.next

        if fast:
            head_rev = slow.next
            slow.next = None
        else:
            head_rev = slow
            prev.next = None

        if not head_rev:
            return

        prev = None
        fut = head_rev

        while fut.next:
            fut = fut.next
            head_rev.next = prev
            prev = head_rev
            head_rev = fut

        head_rev.next = prev

        odd = head
        fut = odd.next
        while fut and head_rev:
            odd.next = head_rev
            odd = odd.next
            head_rev = head_rev.next
            odd.next = fut
            odd = odd.next
            fut = fut.next

        if head_rev:
            odd.next = head_rev
