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
        int val = postorder[postEnd];
        TreeNode root = new TreeNode(val);
        int index = inStart;
        for(;index<=inEnd;index++){
            if(inorder[index] == val) break;
        }
        int leftTreeSize = index - inStart;
        int rightTreeSize = inEnd - index;
        root.left = buildTreeHelper(inorder,inStart,index-1,postorder,postStart,postStart + leftTreeSize - 1);
        root.right = buildTreeHelper(inorder,index+1,inEnd,postorder,postEnd -rightTreeSize ,postEnd-1);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTreeHelper(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
        
    }
}