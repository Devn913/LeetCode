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
    public int maxLevelSum(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int maxSum = root.val;
        int maxLevel = 1;
        int tempLevel = 0;
        while(!q.isEmpty()){
            int tempSum = 0;
            for(int i = q.size();i>0;i--){
                TreeNode front = q.peek();
                q.remove();
                tempSum+=front.val;
                if(front.left!=null){
                    q.add(front.left);
                }if(front.right!=null){
                    q.add(front.right);
                }
            }
            tempLevel++;
            if(tempSum>maxSum){
                maxSum = tempSum;
                maxLevel = tempLevel;
            }
        }
        return maxLevel;
    }
}