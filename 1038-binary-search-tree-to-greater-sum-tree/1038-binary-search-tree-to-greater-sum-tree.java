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
    public TreeNode bstToGst(TreeNode root) {
        // if(root =)
        TreeNode root2 = root;
        Stack<TreeNode> s = new Stack<>();
        int sum = 0;
        while(!s.empty() || root!=null){
            while(root!=null){
                s.push(root);
                root = root.right;
            }
            root = s.pop();
            sum+=root.val;
            root.val = sum;
            root = root.left; 
        }
        return root2;
    }
}