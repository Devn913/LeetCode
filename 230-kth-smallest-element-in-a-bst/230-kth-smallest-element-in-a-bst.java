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
    int val;
    public int helper(TreeNode root){
        if(root == null) return -1;
        if(val == 0) return root.val;
        int ans = helper(root.left);
        if(ans!=-1) return ans;
        val--;
        if(val == 0) return root.val;
        ans = helper(root.right);
        return ans;
        
    }
    public int kthSmallest(TreeNode root, int k) {
        val = k;
        return helper(root);
    }
}