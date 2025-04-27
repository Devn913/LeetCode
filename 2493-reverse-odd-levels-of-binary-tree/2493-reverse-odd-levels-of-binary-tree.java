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
    public TreeNode reverseOddLevels(TreeNode root) {
        TreeNode temp = root;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean level  = false;
        while(!q.isEmpty()){
            Stack<Integer> temp_s = new Stack<>();
            Queue<TreeNode> temp_q = new LinkedList<>();
            for(int i = q.size();i!=0;i--){
                if(level){
                    temp_q.add(q.peek());
                    temp_s.add(q.poll().val);
                }else{
                    root = q.poll();
                    if(root.left!=null) q.add(root.left);
                    if(root.right!=null) q.add(root.right);
                }
            }

            if(level){
                while(!temp_q.isEmpty()){
                    root = temp_q.poll();
                    if(root.left!=null) q.add(root.left);
                    if(root.right!=null) q.add(root.right);
                    root.val = temp_s.pop();
                }
            }
            level = !level;
        }
        return temp;
    }
}