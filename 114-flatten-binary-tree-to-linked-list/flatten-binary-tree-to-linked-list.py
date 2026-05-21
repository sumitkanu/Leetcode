# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def flatten(self, root: Optional[TreeNode]) -> None:
        """
        Do not return anything, modify root in-place instead.
        """
        def dfs(root):
            if not root:
                return root

            if not root.left and not root.right:
                return root

            right = root.right
            if root.left:
                root.right = root.left
                root.left = None
                last = dfs(root.right)
            else:
                last = root

            if right and last:
                last.right = right
                return dfs(right)
            
            return last

        dfs(root)