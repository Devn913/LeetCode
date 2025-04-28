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
    String ans = "";
    public void dfs(TreeNode root, String currString){
        if(root == null) return;

        currString  = (char) (root.val + 'a') + currString;

        if(root.left==null && root.right == null){
            if(ans.isEmpty() || currString.compareTo(ans)<0){
                ans = currString;
            }
        }
        dfs(root.left,currString);
        dfs(root.right,currString);

    }
    public String smallestFromLeaf(TreeNode root) {
        dfs(root,"");
        return ans;
    }
}