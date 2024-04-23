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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return  total( root,  targetSum, 0);
    }

    public boolean total(TreeNode root, int targetSum, int cur) {
        if (root == null)
        return false;

        cur += root.val;
        if (cur == targetSum && root.left == null && root.right == null) {
            return true;
        }
        
        return total( root.right,  targetSum,  cur) || total( root.left,  targetSum,  cur);
}

}