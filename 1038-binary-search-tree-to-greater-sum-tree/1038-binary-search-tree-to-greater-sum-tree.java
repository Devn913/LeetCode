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
    int pre = 0;
    public TreeNode bstToGst(TreeNode root) {
        if(root== null) return root;
        if(root.right!=null) bstToGst(root.right);
        pre = root.val = pre+root.val;
        if (root.left != null) bstToGst(root.left);
        return root;
    }
}