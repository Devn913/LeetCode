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
    public List<Integer> lastLevel(TreeNode root){
        if(root==null) return new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        s.add(root);
        while(!s.isEmpty()){
            root = s.pop();
            if(root.left == null && root.right==null){
                list.add(root.val);
                continue;
            }
            if(root.left!=null) s.push(root.left);
            if(root.right!=null) s.push(root.right);

        }
        return list;
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = lastLevel(root1);
        List<Integer> list2 = lastLevel(root2);
        return list1.equals(list2);
       
        
    }
}