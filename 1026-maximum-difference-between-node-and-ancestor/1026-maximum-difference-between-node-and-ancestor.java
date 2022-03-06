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
    class Node{
        int max;
        int min;
        int maxAns;
        Node(int max, int min, int maxAns){
            this.max = max;
            this.min = min;
            this.maxAns = maxAns;
        }
    }
    public Node helper(TreeNode root){
        if(root.left == null && root.right == null) return new Node(root.val,root.val,0);
        if(root.left == null && root.right!=null){
            Node right = helper(root.right);
            int maxAns = Math.max(right.maxAns,Math.max(Math.abs(root.val - right.max),Math.abs(root.val - right.min)));
            return new Node(Math.max(right.max,root.val),Math.min(right.min,root.val),maxAns);
        }
        if(root.left != null && root.right==null){
            Node right = helper(root.left);
            int maxAns = Math.max(right.maxAns,Math.max(Math.abs(root.val - right.max),Math.abs(root.val - right.min)));
            return new Node(Math.max(right.max,root.val),Math.min(right.min,root.val),maxAns);
        }
        Node left = helper(root.left);
        Node right = helper(root.right);
        int ans1 = Math.max(Math.abs(root.val - left.min),Math.abs(root.val-left.max));
        int ans2 = Math.max(Math.abs(root.val - right.min),Math.abs(root.val-right.max));
        int maxAns = Math.max(left.maxAns,Math.max(right.maxAns,Math.max(ans1,ans2)));
        int max = Math.max(left.max,Math.max(root.val,right.max));
        int min = Math.min(left.min,Math.min(root.val,right.min));
        return new Node(max,min,maxAns);
    }
    public int maxAncestorDiff(TreeNode root) {
        return helper(root).maxAns;
    }
}