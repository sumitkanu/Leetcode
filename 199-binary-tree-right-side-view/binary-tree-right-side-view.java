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
    private List<Integer> ans;
    public List<Integer> rightSideView(TreeNode root) {
        ans = new ArrayList<>();
        bfs(root, 0);
        return ans;
    }

    private void bfs(TreeNode root, int depth) {
        if (root == null) return;

        if (ans.size() <= depth) {
            ans.add(root.val);
        } else {
            ans.set(depth, root.val);
        }

        bfs(root.left, depth + 1);
        bfs(root.right, depth + 1);
    }
}