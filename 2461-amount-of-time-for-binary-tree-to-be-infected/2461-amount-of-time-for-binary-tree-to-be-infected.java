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
    public int amountOfTime(TreeNode root, int start) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;
        HashMap<TreeNode,TreeNode> parents = new HashMap<>();
        Queue<TreeNode> q                  = new LinkedList<>();
        TreeNode mainNode                  = null;
        q.add(root);
        while(!q.isEmpty()){
            for(int i = q.size();i!=0;i--){
                TreeNode node = q.poll();
                if(node.val == start) mainNode = node;

                if(node.left != null){
                    parents.put(node.left,node);
                    q.add(node.left);
                }

                if(node.right != null){
                    parents.put(node.right,node);
                    q.add(node.right);
                }
            }

        }
        q.add(mainNode);
        int time = 0;
        HashSet<TreeNode> visited = new HashSet<>();
        visited.add(mainNode);
        while(!q.isEmpty()){
            for(int i = q.size();i!=0;i--){
                TreeNode node = q.poll();
                if(node.left != null && !visited.contains(node.left)){
                    q.add(node.left);
                }

                if(node.right!=null && !visited.contains(node.right)){
                    q.add(node.right);

                }

                if(parents.containsKey(node) && !visited.contains(parents.get(node))){
                    q.add(parents.get(node));
                }
                visited.add(node);

            }
            time++;
        }
        return time-1;
    }
}