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
    public int helper(TreeNode root, int currentNum){
        if(root == null) return 0;
        currentNum = currentNum*10+root.val;
        if(root.left == null && root.right == null) return currentNum;
        return helper(root.left,currentNum) + helper(root.right,currentNum);
    }
    public int sumNumbers(TreeNode root) {
        return helper(root,0);
    }
}