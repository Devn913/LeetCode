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
    class Pair{
        int height;
        int dia;
        Pair(int h, int d){
            this.height = h;
            this.dia    = d; 
        }
    }

    public Pair helper(TreeNode root){
        if(root == null) return new Pair(0,0);

        Pair left = helper(root.left);
        Pair right = helper(root.right);


        Pair ans  = new Pair(0,0);
         
        ans.dia = Math.max(left.dia,Math.max(right.dia,left.height+right.height+1));
        ans.height = Math.max(left.height,right.height)+1;
        return ans;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return helper(root).dia - 1;
    }
}