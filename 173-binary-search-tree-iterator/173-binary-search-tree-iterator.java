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
class BSTIterator {
    
     Queue<Integer> q = new LinkedList<>();

    public BSTIterator(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        TreeNode curr = root;
        while(curr!=null ||  s.size() > 0){
            while(curr!=null){
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            q.add(curr.val);
            curr = curr.right;
        }
    }
    
    public int next() {
        int val = q.peek();
        q.remove();
        return val;
    }
    
    public boolean hasNext() {
        return q.size()!=0;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */