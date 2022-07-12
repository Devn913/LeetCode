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
    public List<TreeNode> delNodesHelper(TreeNode root, HashSet<Integer> set){
        List<TreeNode> list = new ArrayList<>();
        if(root == null) return list;
        if(set.contains(root.val)){
            list.addAll(delNodesHelper(root.left,set));            
            list.addAll(delNodesHelper(root.right,set));
            return list;
        }
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root1 = root;
        q.add(root);
        while(!q.isEmpty()){
            for(int i = q.size();i!=0;i--){
                root = q.remove();
                if(root.left !=null){
                    if(set.contains(root.left.val)){
                        list.addAll(delNodesHelper(root.left,set));
                        root.left = null;
                    }else{
                        q.add(root.left);
                    }
                }               
                if(root.right !=null){
                    if(set.contains(root.right.val)){
                        list.addAll(delNodesHelper(root.right,set));
                        root.right = null;
                    }else{
                        q.add(root.right);
                    }
                }
            }
        }
        list.add(root1);
        return list;
    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        HashSet<Integer> set = new HashSet<>();
        for(int n: to_delete){
            set.add(n);
        }
        return delNodesHelper(root,set);
    }
}