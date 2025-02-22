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
    int index = 0;
    public TreeNode helper(ArrayList<Pair<Integer,Integer>> list, int level){
        if(index==list.size()) return null;
        if(list.get(index).getKey() != level) return null;
        TreeNode root = new TreeNode(list.get(index).getValue());
        index++;
        root.left  = helper(list,level+1);
        root.right = helper(list,level+1);
        return root;
    }
    public TreeNode recoverFromPreorder(String traversal) {
        ArrayList<Pair<Integer,Integer>> list = new ArrayList<>();
        int index = 0;
        while(index<traversal.length()){
            int currentLevel = 0;
            while(traversal.charAt(index)=='-' ){
                currentLevel++;
                index++;
            }
            int number = 0;
            while(index<traversal.length() && traversal.charAt(index)!='-' ){
                number = number*10 + (int) traversal.charAt(index) - '0';
                index++;
            }
            list.add(new Pair(currentLevel,number));
        }
        return helper(list,0);
    }
}