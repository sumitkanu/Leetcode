"""
# Definition for a Node.
class Node:
    def __init__(self, val: int = 0, left: 'Node' = None, right: 'Node' = None, next: 'Node' = None):
        self.val = val
        self.left = left
        self.right = right
        self.next = next
"""

class Solution:
    def connect(self, root: 'Optional[Node]') -> 'Optional[Node]':
        if not root:
            return root
        
        arr = deque()
        arr.append(root)

        while arr:
            len_arr = len(arr)
            for i in range(len_arr):
                node = arr.popleft()
                node.next = arr[0] if i+1 < len_arr else None

                if node.left:
                    arr.append(node.left)
                if node.right:
                    arr.append(node.right)

        return root
        