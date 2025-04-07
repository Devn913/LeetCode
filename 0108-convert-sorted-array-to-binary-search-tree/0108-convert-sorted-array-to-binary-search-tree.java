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
    public TreeNode helper(int[] nums, int startIndex, int endIndex){
        if(startIndex>endIndex) return null;
        if(startIndex==endIndex) return new TreeNode(nums[startIndex]);

        int mid = (startIndex+endIndex)/2;

        TreeNode root = new TreeNode(nums[mid]);

        root.left = helper(nums,startIndex,mid-1);
        root.right = helper(nums,mid+1,endIndex);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
        
    }
}