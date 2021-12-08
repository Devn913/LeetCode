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
    public int leftDepth(TreeNode root){
        if(root==null) return 0;
        int counter = 0;
        while(root!=null){
            root = root.left;
            counter++;
        }
        return counter;
    }
    public int rightDepth(TreeNode root){
        if(root==null) return 0;
        int counter = 0;
        while(root!=null){
            root = root.right;
            counter++;
        }
        return counter;
    }
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        int lD = leftDepth(root);
        if(lD == rightDepth(root)){
            return (int) Math.pow(2,lD) -1;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
        
    }
}