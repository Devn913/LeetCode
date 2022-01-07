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
    public List<Integer> toList(TreeNode root){
        if(root==null) return  new ArrayList<>(0);
        List<Integer> list = new ArrayList<>();
        list.addAll(toList(root.left));
        list.add(root.val);
        list.addAll(toList(root.right));
        return list;
    }
    
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer>  list1 = toList(root1);
        List<Integer>  list2 = toList(root2);
        List<Integer> list = new ArrayList<>();
        int i =0;
        int j = 0;
        while(i<list1.size() || j<list2.size()){
            if(i==list1.size()){
                list.add(list2.get(j));
                j++;
                continue;
            }
            if(j==list2.size()){
                list.add(list1.get(i));
                i++;
                continue;
            }
            if(list1.get(i)>=list2.get(j)){
                list.add(list2.get(j));
                j++;
            }else{
                list.add(list1.get(i));
                i++;
            }
        }
        return list;
    }
}