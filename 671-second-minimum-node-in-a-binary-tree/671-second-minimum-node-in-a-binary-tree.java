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
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null || root.right==null || root.left==null) return -1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        Integer secondMin = null;
        while(q.size()!=0){
            TreeNode front = q.remove();
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
            if(front.val!=root.val) {
			    if(secondMin==null) secondMin = front.val;
			    else secondMin = Math.min(secondMin, front.val);
		    }
        }
        return secondMin==null? -1 : secondMin;
    }
}