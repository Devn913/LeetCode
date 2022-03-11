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
    public int childSum(TreeNode root){
        if(root == null){
            return 0;
        }
        int ans = 0;
        if(root.left != null){
            ans+=root.left.val;
        }
        if(root.right != null){
            ans+= root.right.val;
        }
        return ans;
    }
    public int sumEvenGrandparent(TreeNode root) {
        if(root==null){
            return 0;
        }
        int ans = 0;
        if(root.val%2==0){
            ans += childSum(root.left);
            ans += childSum(root.right);
        }
        return ans + sumEvenGrandparent(root.left) + sumEvenGrandparent(root.right);
    }
}