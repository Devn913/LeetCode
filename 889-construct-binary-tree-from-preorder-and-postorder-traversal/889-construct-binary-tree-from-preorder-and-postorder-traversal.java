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
    public TreeNode contructFromPrePost(int[] preorder, int preStart, int preEnd, int[] postorder, int posStart, int posEnd){
        if(preStart>preEnd) return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        if(preStart==preEnd) return root;
        int index = posStart;
        while(index>=posStart){
            if(postorder[index] == preorder[preStart+1]) break;
            index++;
        }
        root.left = contructFromPrePost(preorder,preStart+1,preStart+index - posStart+1,postorder,posStart,index);
        root.right = contructFromPrePost(preorder,preEnd - ( posEnd - index - 1)+1,preEnd,postorder,index+1,posEnd-1);
        return root;
    }
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int len = preorder.length-1;
        return contructFromPrePost(preorder,0,len, postorder, 0, len);
    }
}