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
     LinkedList<Integer> list = new LinkedList<Integer>();

    public List<Integer> inorderTraversal(TreeNode root) {
      rec(root);
      return list;
    }

    public void rec(TreeNode node ) {
        if (node == null)
        return;

        rec(node.left);
        list.add(node.val);
        rec(node.right);
    }


}