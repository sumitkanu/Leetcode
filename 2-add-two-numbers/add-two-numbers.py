# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        carry = 0
        ans = l1
        prev = None
        while l1 and l2:
            prev = l1
            val = l1.val + l2.val + carry
            l1.val = val % 10
            carry = val // 10
            l1 = l1.next
            l2 = l2.next
        
        while l2:
            val = l2.val + carry
            l2.val = val % 10
            carry = val // 10
            prev.next = l2
            prev = l2
            l2 = l2.next
        
        while l1:
            val = l1.val + carry
            l1.val = val % 10
            carry = val // 10
            prev = l1
            l1 = l1.next
        
        if carry != 0:
            prev.next = ListNode(val = carry)
        
        return ans

