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
     

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
        return rec(root, list);
    }

        public List<Integer> rec(TreeNode node, List<Integer> list ) {
        if (node == null)
        return list;

        list.add(node.val);
        rec(node.left, list);
        rec(node.right, list);

        return list;
        
    }
}