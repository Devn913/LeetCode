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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        while(!q.isEmpty()){
            for(int i = q.size();i!=0;i--){
                root = q.poll();
                if(i == 1) result.add(root.val);

                if(root.left!=null) q.add(root.left);
                if(root.right!=null) q.add(root.right);
            }
        }
        return result;
    }
}