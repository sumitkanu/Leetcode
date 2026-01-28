# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def traversal(self, root: Optional[TreeNode], ans: List[int], stack: List[int]) -> None:
        if not root:
            return

        stack.append(root.val)
        
        self.traversal(root.left, ans, stack)
        ans.append(stack.pop())
        self.traversal(root.right, ans, stack)

    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        ans = []
        stack = []
        self.traversal(root, ans, stack)
        return ans