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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        int level = 1;
        int maxVal = root.val;
        int max = 1;

        while(!q.isEmpty()) {
            int qsize = q.size();
            int levelSum = 0;

            for(int i = 0; i < qsize; i++) {
                TreeNode node = q.poll();
                levelSum += node.val;

                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }

            if (levelSum > maxVal) {
                maxVal = levelSum;
                max = level;
            }

            level++;
        }

        return max;
    }
}