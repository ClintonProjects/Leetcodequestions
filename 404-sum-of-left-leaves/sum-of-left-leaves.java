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
    private int total = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        sum(root, false);
        return total;
    }

    public void sum(TreeNode root, boolean left) {
        if (root == null) return;

        if (root.left == null && root.right == null && left) {
            total += root.val;
        }

        sum(root.left, true);
        sum(root.right, false);
    }
}
