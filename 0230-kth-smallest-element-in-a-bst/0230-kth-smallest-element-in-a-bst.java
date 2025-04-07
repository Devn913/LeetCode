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

    ArrayList<Integer> result = new ArrayList<>();

    public void helper(TreeNode root, int k){
        if(root == null) return;
        if(result.size() == k) return;

        helper(root.left,k);
        if(result.size() == k) return;
        result.add(root.val);
        if(result.size() == k) return;
        helper(root.right,k);
        
    } 

    public int kthSmallest(TreeNode root, int k) {
        helper(root,k);
        return result.get(k-1);
    }


    // Approach: 1 Brute Forc
    // ArrayList<Integer> result = new ArrayList<>();

    // public void inorder(TreeNode root){
    //     if(root == null) return;
    //     inorder(root.left);
    //     result.add(root.val);
    //     inorder(root.right);
    // }

    // public int kthSmallest(TreeNode root, int k) {
    //     inorder(root);
    //     return result.get(k-1);
        


}