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
    public void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        flatten(root.left);
        flatten(root.right);
        TreeNode leftTemp = root.left;
        root.left = null;
        TreeNode rightTemp = root.right;
        if(leftTemp!=null){
            root.right = leftTemp;
            while(leftTemp.right!=null){
                leftTemp = leftTemp.right;
            }
            leftTemp.right = rightTemp;
        }else{
            root.right = rightTemp;
        }
        
    }
}