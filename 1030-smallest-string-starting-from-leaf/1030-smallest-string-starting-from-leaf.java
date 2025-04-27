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
    public void dfs(TreeNode root, String currentString){
        if(root == null) return;

        currentString = (char) (root.val+'a') + currentString;
        if(root.left==null && root.right==null){
            if(ans.isEmpty() || ans.compareTo(currentString)>0){
                ans = currentString;
            }
        }
        if(root.left!=null)  dfs(root.left,currentString);
        if(root.right!=null) dfs(root.right,currentString);
        


    }
    public String smallestFromLeaf(TreeNode root) {
        dfs(root,"");
        return ans;
    }
}