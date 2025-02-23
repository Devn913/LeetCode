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
    HashMap<Integer,Integer> postorderMap = new HashMap<>();
    int preOrderIndex = 0;
    
    public TreeNode helper(int[] preorder, int[] postorder, int lowPostOrderIndex, int highPostOrderIndex){
        if(lowPostOrderIndex>highPostOrderIndex) return null;
        TreeNode root = new TreeNode(preorder[preOrderIndex]);
        preOrderIndex++;
        if(lowPostOrderIndex == highPostOrderIndex ) {
            return root;
        }
        int breakingPoint = postorderMap.get(preorder[preOrderIndex]);
        root.left = helper(preorder,postorder,lowPostOrderIndex,breakingPoint);
        root.right = helper(preorder,postorder,breakingPoint+1,highPostOrderIndex-1);
        return root;
    }
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        for(int i=0;i<postorder.length;i++){
            postorderMap.put(postorder[i],i);
        }
        TreeNode root = helper(preorder,postorder,0,preorder.length-1);
        return root;


    }
}