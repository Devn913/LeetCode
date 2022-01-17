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
    public TreeNode buildTreeHelper(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd){
        if(inStart>inEnd) return null;
        TreeNode root = new TreeNode(postorder[postEnd]);
        int index = inStart;
        for(;index<=inEnd;index++){
            if(inorder[index] == postorder[postEnd]) break;
        }
        root.left = buildTreeHelper(inorder,inStart,index-1,postorder,postStart,postStart + index - inStart - 1);
        root.right = buildTreeHelper(inorder,index+1,inEnd,postorder,postEnd -(inEnd - index) ,postEnd-1);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTreeHelper(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
        
    }
}