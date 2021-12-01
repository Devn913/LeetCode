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
    public Pair<Integer,Integer> heightDiameter(TreeNode root){
        if(root==null){
            Pair<Integer, Integer> p1 = new Pair<>(0,0);
            return p1;
        }
        Pair<Integer,Integer> output1 = heightDiameter(root.left);
        Pair<Integer,Integer> output2 = heightDiameter(root.right);
        int lh = output1.getKey();
        int ld = output1.getValue();
        int rh = output2.getKey();
        int rd = output2.getValue();
        Pair<Integer, Integer> output3 = new Pair<Integer, Integer>(Math.max(lh,rh)+1, Math.max(lh+rh, Math.max(ld,rd)));
        return output3;
        
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return heightDiameter(root).getValue();
    }
}