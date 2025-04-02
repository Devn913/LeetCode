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

    // Approach 2: Swap Nodes
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        invertTree(root.left);
        invertTree(root.right);
        
        return root;        
    }

    // Approach 1: Create New Tree
    // public TreeNode invertTree(TreeNode root) {
    //     if(root == null) return null;
    //     TreeNode node = new TreeNode(root.val);
    //     node.left = invertTree(root.right);
    //     node.right = invertTree(root.left);
    //     return node;
    // }
}