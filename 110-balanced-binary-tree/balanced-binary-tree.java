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

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int l = count(root.left, 1);
        int r =  count(root.right, 1);
        return Math.abs(l-  r) < 2 && isBalanced(root.left) && isBalanced(root.right);
    }

    public int count(TreeNode t, int count) {
        if (t == null) return count;
        count = 1 + Math.max(count(t.left, count), count(t.right, count));
        return count;
    }
}
