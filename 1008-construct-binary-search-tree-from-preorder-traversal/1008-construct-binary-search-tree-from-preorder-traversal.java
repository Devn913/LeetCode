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
    public TreeNode bstFromPreorder(int[] preorder, int startIndex, int endIndex) {
        if(startIndex>endIndex) return null;
        int val = preorder[startIndex];
        TreeNode root = new TreeNode(val);
        int index = startIndex+1;
        while(index<=endIndex && preorder[index]<val) index++;
        root.left = bstFromPreorder(preorder,startIndex+1,index-1);
        root.right = bstFromPreorder(preorder,index,endIndex);
        return root;
        
            
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        return bstFromPreorder(preorder,0,preorder.length-1);
    }
}