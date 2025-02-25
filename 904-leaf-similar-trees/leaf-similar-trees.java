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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        leafList(root1, arr1);
        leafList(root2, arr2);

        if(arr1.size() != arr2.size()) return false;

        for(int i=0; i<arr1.size(); i++) {
            if (!arr1.get(i).equals(arr2.get(i))) return false;
        }

        return true;
    }

    private void leafList(TreeNode root, List<Integer> list) {
        if(root.left == null && root.right == null) {
            list.add(root.val);
            return;
        }

        if(root.left != null) leafList(root.left, list);
        if(root.right != null) leafList(root.right, list);
    }
}