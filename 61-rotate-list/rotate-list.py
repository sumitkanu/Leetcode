# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def rotateRight(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        if not head:
            return head

        size = 0
        curr_node = head
        prev = None

        while curr_node:
            size += 1
            prev = curr_node
            curr_node = curr_node.next

        k = k % size

        curr_node = head
        for _ in range(size - k - 1):
            curr_node = curr_node.next

        new_head = curr_node.next if curr_node.next else head
        new_tail = curr_node

        prev.next = head
        new_tail.next = None

        return new_head