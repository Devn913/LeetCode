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
    
    public TreeNode helperTree(int[] nums, int si, int ei){
        if(si>ei){
            return null;
        }
        int max = si;
        for(int i =si+1;i<=ei;i++){
            if(nums[i]>nums[max]) max = i;
        }
        TreeNode root = new TreeNode(nums[max]);
        root.left = helperTree(nums, si, max-1);
        root.right = helperTree(nums, max+1,ei);
        return root;
        
    }
    
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helperTree(nums,0,nums.length-1);
    }
}