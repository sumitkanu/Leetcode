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
    private Deque<TreeNode> stack = new LinkedList<>();
    private Deque<Integer> upperLimits = new LinkedList<>();
    private Deque<Integer> lowerLimits = new LinkedList<>();

    public void update(TreeNode root, Integer low, Integer high) {
        stack.add(root);
        lowerLimits.add(low);
        upperLimits.add(high);
    }

    public boolean isValidBST(TreeNode root) {
        Integer low = null, high = null, val;
        update(root,low,high);

        while(!stack.isEmpty()) {
            root = stack.poll();
            low = lowerLimits.poll();
            high = upperLimits.poll();

            if (root == null) continue;
            if (low != null && root.val <= low) {
                return false;
            }
            if (high != null && root.val >= high) {
                return false;
            }

            update(root.left, low, root.val);
            update(root.right, root.val, high);
        }

        return true;
    }
}