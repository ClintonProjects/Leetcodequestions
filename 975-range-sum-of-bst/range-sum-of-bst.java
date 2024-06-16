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

    public int rangeSumBST(TreeNode root, int low, int high) {
        //I'll try soultion with less space usage after.
        helper(root, low, high);
        return sum;
    }

    private int sum = 0;

    public void helper(TreeNode node, int a, int b) {
        if (node == null) return;

        if (node.val >= a && node.val <= b) {
            sum += node.val;
        }

        if (node.left != null) {
            helper(node.left,a,b);
        }

        if (node.right != null) {
            helper(node.right,a,b);
        }
    }
}
