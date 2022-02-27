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
    class pair{
        int index;
        TreeNode node;
        pair(TreeNode node, int index){
            this.index = index;
            this.node = node;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<pair> q = new LinkedList<>();
        int leftMost = -1;
        int rightMost = -1;
        int max = 0;
        q.add(new pair(root,0));
        while(!q.isEmpty()){
            for(int i = q.size();i!=0;i--){
                pair front = q.remove();
                if(leftMost == -1 && rightMost == -1){
                    leftMost = front.index;
                    rightMost = front.index;
                }else if(rightMost<front.index){
                    rightMost = front.index;
                }
                if(front.node.left!=null) q.add(new pair(front.node.left, 2 * front.index + 1));
                if(front.node.right!=null) q.add(new pair(front.node.right, 2 * front.index + 2));
            }
            max = Math.max(max,rightMost - leftMost +1);
            leftMost = -1;
            rightMost = -1;
        }
        return max;
    }
}