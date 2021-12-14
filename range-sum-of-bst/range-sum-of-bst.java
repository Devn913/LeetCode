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
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null) return 0;
        int sum = 0;
        if(root.val>high) sum += rangeSumBST(root.left,low,high);
        if(root.val<low) sum += rangeSumBST(root.right,low,high);
        if(root.val<=high && root.val>=low) {
            sum+=root.val;
            sum+=rangeSumBST(root.left,low,high);
            sum+=rangeSumBST(root.right,low,high);
        }
        return sum;
    }
}