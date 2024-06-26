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
        List<Integer> ls = new ArrayList<Integer>();
        helper(root1, ls);

        List<Integer> ls2 = new ArrayList<Integer>();
        helper(root2, ls2);

        return ls.equals(ls2);
    }

    public void helper(TreeNode node, List<Integer> list) {
        if (node.left == null && node.right == null) {
            list.add(node.val);
        }

        if (node.left != null) {
            helper(node.left, list);
        }

        if (node.right != null) {
            helper(node.right, list);
        }
    }
}
