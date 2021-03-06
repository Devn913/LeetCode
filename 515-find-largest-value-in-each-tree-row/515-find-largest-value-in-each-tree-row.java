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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int max  = Integer.MIN_VALUE;
            for(int i = q.size();i>0;i--){
                TreeNode front = q.poll();
                max = Math.max(max,front.val);
                if(front.left!=null) q.offer(front.left);
                if(front.right!=null) q.offer(front.right);
            }
            list.add(max);
        }
        return list;
    }
}