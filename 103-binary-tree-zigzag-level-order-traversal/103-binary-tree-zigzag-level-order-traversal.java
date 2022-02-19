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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean zigzag =  true;
        while(!q.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            for(int i = q.size();i!=0;i--){
                TreeNode front = q.remove();
                if(front.left!=null) q.add(front.left);
                if(front.right!=null) q.add(front.right);
                if(zigzag){
                    temp.add(front.val);
                }else{
                    temp.add(0,front.val);
                }
            }
            list.add(temp);
            zigzag = !zigzag;
        }
    return list;
    }
}