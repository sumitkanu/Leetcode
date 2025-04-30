/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return dfs(root,p,q);
    }

    private TreeNode dfs(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) return root;

        if(p.val < root.val && q.val < root.val) return dfs(root.left,p,q);
        else if(p.val > root.val && q.val > root.val) return dfs(root.right,p,q);
        else{
            TreeNode pval = dfs(root.left,p,q);
            TreeNode qval = dfs(root.right,p,q);

            if(pval !=  null && qval != null) return root;
            else return pval != null ? pval : qval;
        }
    }
}