/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null) return root;

        Queue<Node> q = new LinkedList<>();
        Node temp = root;
        q.add(root);
        while(!q.isEmpty()){

            int n = q.size();

            for(int i = n;i!=0;i--){
                root = q.poll();
                if(i==1){
                    root.next = null;
                }else{
                    root.next = q.peek();
                }

                if(root.left!=null) q.add(root.left);
                if(root.right!=null) q.add(root.right);
            }

        }
        return temp;

    }
}