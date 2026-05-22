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
        curr = root

        while curr:
            if curr.left:
                # Find the rightmost node of the left subtree
                predecessor = curr.left
                while predecessor.right:
                    predecessor = predecessor.right

                # Attach original right subtree after left subtree
                predecessor.right = curr.right

                # Move left subtree to right
                curr.right = curr.left
                curr.left = None

            # Move forward in the flattened chain
            curr = curr.right