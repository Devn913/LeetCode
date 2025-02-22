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
    int index = 0;
    public TreeNode helper(int[] preorder, int upperBound){
        if(index == preorder.length) return null;
        if(preorder[index]>=upperBound) return null;
        TreeNode root = new TreeNode(preorder[index++]);
        root.left = helper(preorder,root.val);
        root.right = helper(preorder,upperBound);
        return root;

    }
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder, Integer.MAX_VALUE);
    }
}