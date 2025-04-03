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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> answer = new ArrayList<>();

        if(root == null) return answer;

        Queue<TreeNode> q =new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){

            double sum = 0;
            int size = q.size();
            for(int i = 0;i<size;i++){
                root = q.poll();
                sum+=root.val;

                if(root.left!=null) q.add(root.left);
                if(root.right !=null) q.add(root.right);
            }
            answer.add(sum/size);
        }
        return answer;
    }
}