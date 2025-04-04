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
    long min = Long.MIN_VALUE;
    long max = Long.MAX_VALUE;

    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        
        if(root.val>min && root.val<max){
            long temp = max;
            max = root.val;
            boolean left = isValidBST(root.left);
            if(!left) return false;
            max = temp;
            min = root.val;
            boolean right = isValidBST(root.right);
            if(!right) return false;
            return true;
        
        }
        return false;
    }
}