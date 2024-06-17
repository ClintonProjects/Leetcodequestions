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
        int l = count(root.left);
        int r =  count(root.right);
        return Math.abs(l-  r) < 2 && isBalanced(root.left) && isBalanced(root.right);
    }

    public int count(TreeNode t) {
        if (t == null) return 0;
        return 1 + Math.max(count(t.left), count(t.right));
    }
}
