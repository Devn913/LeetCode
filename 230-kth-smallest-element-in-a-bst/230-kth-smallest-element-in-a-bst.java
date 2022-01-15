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
    public Pair<Integer,Integer> kHelper(TreeNode root,int k){
        if(root == null) return new Pair<Integer,Integer>(-1,k);
        Pair<Integer,Integer> left = kHelper(root.left,k);
        if(left.getKey()!=-1) return left;
        k = left.getValue();
        k--;
        if(k==0) return new Pair<Integer,Integer>(root.val,k);
        return kHelper(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        return kHelper(root,k).getKey();
    }
}