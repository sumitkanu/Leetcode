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
    int count;
    public int goodNodes(TreeNode root) {
        count = 0;
        dft(root, root.val);

        return count;
    }

    private void dft(TreeNode root, int max) {
        if(root == null) return;
        // System.out.println(root.val);
        // System.out.println(max);
        // System.out.println(count);
        // System.out.println("----------------");

        if(root.val >= max) count++;

        dft(root.left, Math.max(max, root.val));
        dft(root.right, Math.max(max, root.val));
    }
}