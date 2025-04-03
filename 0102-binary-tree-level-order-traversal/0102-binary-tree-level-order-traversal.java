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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){

            List<Integer> level = new ArrayList<>();

            for(int i = q.size();i!=0;i--){
                TreeNode node = q.poll();

                level.add(node.val);

                if(node.left!=null) q.add(node.left);

                if(node.right!=null) q.add(node.right);

            }
            result.add(level);


        }
        return result;
    }
}