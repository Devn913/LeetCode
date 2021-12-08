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
    public int tilt = 0;
    
    public int helperTilt(TreeNode root){
        if(root == null) return 0;
        int ls = helperTilt(root.left);
        int rs = helperTilt(root.right);
        tilt+=Math.abs(ls-rs);
        return ls + rs + root.val;
    }
    
    public int findTilt(TreeNode root) {
        helperTilt(root);
        return tilt;
    }
}