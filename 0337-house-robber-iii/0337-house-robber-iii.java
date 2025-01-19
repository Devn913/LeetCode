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
    public int[] helper(TreeNode root){
        if(root==null){
            int[] ans = {0,0};
            return ans;
        }
        int[] left = helper(root.left);
        int[] right = helper(root.right);
        int[] ans = {0,0};
        ans[0] = root.val + left[1] + right[1];
        ans[1] = Math.max(left[0],left[1]) + Math.max(right[0],right[1]);
        return ans;
    }
    public int rob(TreeNode root) {
        int[] ans = helper(root);
        return Math.max(ans[0],ans[1]);
       
    }
}