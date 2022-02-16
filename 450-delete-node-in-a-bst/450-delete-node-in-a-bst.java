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
    public int getMax(TreeNode root){
        while(root.right!=null) root = root.right;
        return root.val;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return root;
        if(root.val == key){
            if(root.left == null && root.right == null){
                return null;
            }else if(root.left == null && root.right != null){
                return root.right;
            }else if(root.left != null && root.right == null){
                return root.left;
            }else{
                int val = getMax(root.left);
                root.val = val;
                root.left = deleteNode(root.left,val);
            }
        }
        else if(root.val>key){
            root.left = deleteNode(root.left,key);
        }else{
            root.right = deleteNode(root.right,key);
        }
        return root;
    }
}