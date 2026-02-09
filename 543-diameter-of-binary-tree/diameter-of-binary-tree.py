# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        self.big = 0
        self.traverse(root)
        return self.big

    def traverse(self, root):
        if not root:
            return -1

        left = self.traverse(root.left)
        right = self.traverse(root.right)

        self.big = max(self.big, left + right + 2)

        return max(left + 1, right + 1)