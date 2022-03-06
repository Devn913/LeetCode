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
    public int helper(TreeNode root, int currMax, int currMin){
        if(root==null) return currMax-currMin;
        currMax = Math.max(currMax,root.val);
        currMin = Math.min(currMin,root.val);
        int left = helper(root.left,currMax,currMin);
        int right = helper(root.right,currMax,currMin);
        return Math.max(left,right);
    }
    public int maxAncestorDiff(TreeNode root) {
        return helper(root,root.val,root.val);
    }
}