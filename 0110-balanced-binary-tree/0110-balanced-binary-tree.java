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
    public class Pair{
        int height;
        boolean balanced;
        Pair(int height, boolean balanced){
            this.height = height;
            this.balanced = balanced;
        }
    }

    public Pair helper(TreeNode root){
        if(root == null){
            return new Pair(0,true);
        }

        Pair left = helper(root.left);
        Pair right = helper(root.right);


        if(left.balanced == true && right.balanced == true && Math.abs(left.height - right.height) <= 1){
            return new Pair(Math.max(left.height,right.height)+1, true);
        }
        return new Pair(Math.max(left.height,right.height)+1, false);
    }
    public boolean isBalanced(TreeNode root) {
        return helper(root).balanced;
    }
}