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
    public StringBuilder helper(TreeNode root){
        if(root == null) return new StringBuilder();
        StringBuilder left = helper(root.left);
        StringBuilder right = helper(root.right);
        StringBuilder result = new StringBuilder();
        result.append(Integer.toString(root.val));
        if(left.length()==0 && right.length() == 0) return result;
        if(left.length() !=0 && right.length() ==0){
            result.append("(");
            result.append(left.toString());
            result.append(")");
            return result;
        }
        result.append("(");
        result.append(left.toString());
        result.append(")");
        result.append("(");
        result.append(right.toString());
        result.append(")");
        return result;

    }
    public String tree2str(TreeNode root) {
        return helper(root).toString();
    }
}