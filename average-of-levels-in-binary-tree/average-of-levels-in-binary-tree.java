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
    
    public int level(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(level(root.left), level(root.right));
        
    }
    
    public Pair<Long,Long> levelHelper(TreeNode root, int level){
        if(root == null) {
            Pair<Long, Long> p = new  Pair<Long,Long>((long) 0,(long) 0);
            return p;
        }
        if(level==0){
            Pair<Long,Long> p = new  Pair<Long,Long>((long)1,(long) root.val);
            return p;
        }
        Pair<Long, Long> p1 = levelHelper(root.left,level-1);
        Pair<Long, Long> p2 = levelHelper(root.right,level-1);
        Pair<Long, Long> p = new  Pair<Long,Long>( p1.getKey()+p2.getKey(),p1.getValue()+p2.getValue());
        return p;
    }
    public List<Double> averageOfLevels(TreeNode root) {
        int maxLevel = level(root);
        List<Double> list = new ArrayList<Double>(maxLevel);
        for(int i=0;i<maxLevel;i++){
            Pair<Long,Long> p1 = levelHelper(root,i);
            list.add( (p1.getValue())/(double)p1.getKey());
        }

        return list;
    }
}