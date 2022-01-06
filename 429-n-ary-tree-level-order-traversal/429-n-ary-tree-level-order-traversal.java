/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        List<Integer> root_list = new ArrayList<>(1);
        root_list.add(root.val);
        list.add(root_list);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int nextSize = 1;
        while(!q.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int till = nextSize;
            nextSize = 0;
            for(int i = 0;i<till;i++){
                Node front = q.peek();
                q.remove();
                for(int j = 0;j<front.children.size();j++){
                    temp.add(front.children.get(j).val);
                    q.add(front.children.get(j));
                }
                nextSize+=front.children.size();
            }
            if(temp.size()!=0) list.add(temp);
        }
        return list;
    }
}