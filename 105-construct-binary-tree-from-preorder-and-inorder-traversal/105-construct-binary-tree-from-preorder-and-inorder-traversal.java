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
    private TreeNode helper(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd,HashMap<Integer,Integer> map){
        if(preStart>preEnd) return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        int index = map.get(preorder[preStart]);
        root.left = helper(preorder,inorder,preStart+1,preStart+index - inStart,inStart,index,map);
        root.right  = helper(preorder,inorder,preStart+1+index - inStart,preEnd,index+1,inEnd,map);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = preorder.length;
        HashMap<Integer,Integer> map = new HashMap<>(len);
        for(int i = 0;i<len;i++) map.put(inorder[i],i);
        return helper(preorder,inorder,0,len-1,0,len-1,map);
    }
}