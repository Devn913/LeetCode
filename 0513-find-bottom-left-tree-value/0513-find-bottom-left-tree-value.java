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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int ans = -1;
        while(!q.isEmpty()){
            ans = q.peek().val;
            for(int i = q.size()-1;i!=-1;i--){
                root = q.poll();
                if(root.left !=null) q.add(root.left);
                if(root.right!=null) q.add(root.right);
            }
        }
        return ans;
    }
}