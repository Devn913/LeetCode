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
    public int height(TreeNode root){
        if(root == null) return 0;
        int lH = height(root.left);
        int rH = height(root.right);
        return Math.max(lH,rH) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        int lH = height(root.left);
        int rH = height(root.right);
        if(Math.abs(lH-rH)<=1 && isBalanced(root.left) && isBalanced(root.right)){
            return true;
        }
        return false;
    }
}