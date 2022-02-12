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
    int ans;
    class Quad{
        int sum;
        int max;
        int min;
        boolean isBST;
        Quad(int max,int min,int sum, boolean isBST){
            this.max = max;
            this.min = min;
            this.sum = sum;
            this.isBST = isBST;
        }
    }
    public Quad maxSumHelper(TreeNode root){
        if(root == null){ 
            return new Quad(Integer.MIN_VALUE,Integer.MAX_VALUE,0,true);
        }
        Quad left = maxSumHelper(root.left);
        Quad right = maxSumHelper(root.right);
        boolean isBST = false;
        int max = Math.max(root.val,Math.max(left.max,right.max));
        int min = Math.min(root.val,Math.min(left.min,right.min));
        int sum = Math.max(0,Math.max(left.sum,right.sum));
        if(left.isBST && right.isBST && left.max < root.val && right.min > root.val){
            isBST = true;
            sum  = root.val + left.sum + right.sum;
        }
        ans = Math.max(ans,sum);
        return new Quad(max,min,sum,isBST);
        
    }
    public int maxSumBST(TreeNode root) {
        ans = Integer.MIN_VALUE;
        Quad Q = maxSumHelper(root);
        return Math.max(ans,0);
    }
}