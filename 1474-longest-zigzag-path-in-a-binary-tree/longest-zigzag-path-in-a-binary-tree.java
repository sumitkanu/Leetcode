/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max = 0;

    public int longestZigZag(TreeNode root) {
        max = 0;
        dfs(root, 0, -1);

        return max;
    }

    private void dfs(TreeNode root, int len, int prev) {
        if(root == null) return;
        System.out.println(len);
        System.out.println(prev);
        System.out.println("------------");
        max = Math.max(max, len);

        dfs(root.left, prev == 1 || prev == -1 ? len+1 : 1, 0);
        dfs(root.right, prev == 0 || prev == -1 ? len+1 : 1, 1);
     }
}