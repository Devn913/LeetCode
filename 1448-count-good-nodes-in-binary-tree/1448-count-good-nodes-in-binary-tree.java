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
    
    public int helper(TreeNode root,int maxVal,int rootVal){
        if(root==null) return 0;
        int ans = 0;
        if(root.val>=rootVal && root.val>=maxVal) ans++;
        maxVal = Math.max(root.val,maxVal);
        return ans + helper(root.left,maxVal,rootVal) + helper(root.right,maxVal,rootVal);
    }
    
    public int goodNodes(TreeNode root) {
        return helper(root,root.val,root.val);
    }
}