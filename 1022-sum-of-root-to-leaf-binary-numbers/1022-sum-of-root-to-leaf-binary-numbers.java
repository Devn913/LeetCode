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
    
    public List<String> toList(TreeNode root){
         List<String> list = new ArrayList<>();
        if(root == null) return list;
        if(root.left==null && root.right == null){
           
            list.add(Integer.toString(root.val));
            return list;
        }
        list = toList(root.left);
        list.addAll(toList(root.right));
        for(int i =0;i<list.size();i++){
            list.set(i,Integer.toString(root.val) + list.get(i));
        }
        return list;
    }
    public int binaryToInt(String s){
        int res = 0;
        int len = s.length();
        for(int i= 0;i<len;i++){
            int c = s.charAt(len - i -1) - '0';
            res+=((int)c * Math.pow(2,i));
        }
        return res;
    }
    public int sumRootToLeaf(TreeNode root) {
        List<String> list = toList(root);
        int res = 0;
        for(int i = 0;i<list.size();i++){
            res+=binaryToInt(list.get(i));
        }
        return res;
    }

}