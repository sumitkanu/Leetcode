# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
        return self.dfs(root, subRoot)
    
    def dfs(self, p, q):
        res = False
        if not p and not q:
            return True
        
        if not p:
            return False
        
        if p and q and p.val == q.val:
            res = self.same(p, q)
            print(res, p.val, q.val)
        
        return self.dfs(p.left, q) or self.dfs(p.right, q) or res

    def same(self, p, q):
        if not p and not q:
            return True

        if not p or not q:
            return False

        if p.val != q.val:
            return False

        return self.same(p.left, q.left) and self.same(p.right, q.right)