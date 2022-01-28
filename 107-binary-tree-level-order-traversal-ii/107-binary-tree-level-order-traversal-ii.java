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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        if(root == null) return list;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            for(int i = q.size();i!=0;i--){
                TreeNode front = q.remove();
                temp.add(front.val);
                if(front.left!=null) q.offer(front.left);
                if(front.right!=null) q.offer(front.right);
            }
            list.add(0,temp);
        }
        // Collections.reverse(list);
        return list;
        
        
    }
}