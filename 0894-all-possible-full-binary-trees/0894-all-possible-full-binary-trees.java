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
    public List<TreeNode> helper(int n,HashMap<Integer,List<TreeNode>> map){
        if(n%2 == 0){
            return new ArrayList<>();
        }
        if(map.containsKey(n)) return map.get(n);
        if(n==1){
            TreeNode root = new TreeNode(0);
            List<TreeNode> res = new ArrayList<>();
            res.add(root);
            map.put(1,res);
            return res;

        }
        List<TreeNode> result = new ArrayList<>();
        int temp1 = 1;
        int temp2 = n - 2;
        while(temp2>0){
            List<TreeNode> left = helper(temp1,map);
            List<TreeNode> right = helper(temp2,map);
            for(int i = 0;i<left.size();i++){
                for(int j = 0;j<right.size();j++){
                    TreeNode root = new TreeNode(0);
                    root.left = left.get(i);
                    root.right = right.get(j);
                    result.add(root);
                }
            }
            temp1+=2;
            temp2-=2;
        }
        map.put(n,result);
        return result;

    }
    public List<TreeNode> allPossibleFBT(int n) {

        // List<TreeNode>[] list = new List<TreeNode>[n];
        return helper(n,new HashMap<Integer,List<TreeNode>>());

    }
}