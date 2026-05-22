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
        def findLast(root):
            while root:
                if root.right:
                    root = root.right
                    continue
                elif root.left:
                    root = root.left
                    continue
                return root



        while root:
            right = root.right

            if root.left:
                root.right = root.left
                root.left = None
            else:
                root = root.right
                continue
            
            if root.right:
                last = findLast(root.right)
                if last:
                    last.right = right

            root = root.right