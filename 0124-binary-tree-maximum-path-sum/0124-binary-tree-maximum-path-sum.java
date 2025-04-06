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
    int max = Integer.MIN_VALUE;

    public int helper(TreeNode root){
        if(root == null) return 0;

        int left = helper(root.left);
        int right = helper(root.right);

        max = Math.max(Math.max(max,left+right+root.val),Math.max(left+root.val,right+root.val));
        max = Math.max(max,root.val);
        return Math.max(root.val,Math.max(root.val+left,root.val+right));

    }
    
    public int maxPathSum(TreeNode root) {
        helper(root);
        return max;


    }
}