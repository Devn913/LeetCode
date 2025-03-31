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
    class Pair{
        TreeNode node;
        int verticalLevel;
        Pair(TreeNode node, int verticalLevel){
            this.node          = node;
            this.verticalLevel = verticalLevel;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        HashMap<Integer, List<List<Integer>>> map = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(root,0));
        int min = 0;
        int max = 0;
        int horizontalLevel = 0;

        while(!q.isEmpty()){
            int k = q.size();
            for(int i = 0;i<k;i++){
                Pair p = q.poll();
                if(!map.containsKey(p.verticalLevel)){
                    List<List<Integer>> list = new ArrayList<>();
                    map.put(p.verticalLevel, list);
                }
                List<List<Integer>> list = map.get(p.verticalLevel);
                while(list.size()!=horizontalLevel+1){
                    List<Integer> temp = new ArrayList<>();
                    list.add(temp);
                }
                List<Integer> temp = list.get(horizontalLevel);
                temp.add(p.node.val);

                if(p.node.left!=null){
                    q.add(new Pair(p.node.left,p.verticalLevel-1));
                }
                if(p.node.right!=null){
                    q.add(new Pair(p.node.right,p.verticalLevel+1));
                }
                max = Math.max(max, p.verticalLevel);
                min = Math.min(min, p.verticalLevel);
            }
            horizontalLevel++;
        }
        List<List<Integer>> result = new ArrayList<>();
        for(int i = min;i<=max;i++){
            // if(!map.containsKey(i)) continue;
            List<List<Integer>> list = map.get(i);
            List<Integer> interResult = new ArrayList<>();
            for(int j =0;j<list.size();j++){
                Collections.sort(list.get(j));
                interResult.addAll(list.get(j));
            }
            result.add(interResult);
        }
        return result;
    }
}