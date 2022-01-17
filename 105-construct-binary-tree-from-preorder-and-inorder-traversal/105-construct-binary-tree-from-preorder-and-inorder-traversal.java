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
    private TreeNode buildTreeHelper(int[] inorder, int inStart, int inEnd, int[] preorder, int preStart){
        if(inStart>inEnd) return null;
        int val = preorder[preStart];
        TreeNode root = new TreeNode(val);
        if (inStart == inEnd)
            return root;
        int index = inStart;
        while(index<=inEnd){
            if(inorder[index] == val) break;
            index++;
        }
        root.left = buildTreeHelper(inorder,inStart,index-1,preorder,preStart+1);
        root.right = buildTreeHelper(inorder,index+1,inEnd,preorder,preStart + index - inStart + 1);

        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = preorder.length -1;
        return buildTreeHelper(inorder,0,len,preorder,0);
    }
}