# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        slow = head
        fast = head
        prev = None
        curr = head
        while fast and fast.next:
            fast = fast.next.next
            curr = slow
            slow = slow.next
            curr.next = prev
            prev = curr

        if fast:
            slow = slow.next

        while curr and slow:
            if curr.val != slow.val:
                return False
            curr = curr.next
            slow = slow.next
        
        return True

        

        
        