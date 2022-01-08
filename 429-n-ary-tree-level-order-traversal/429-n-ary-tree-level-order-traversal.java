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
        if(root == null) return new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> root_list = new ArrayList<>(1);
        root_list.add(root.val);
        list.add(root_list);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> temp = new ArrayList<>(q.size());
            for(int i = q.size();i>0;i--){
                Node front = q.peek();
                q.remove();
                for(int j = 0;j<front.children.size();j++){
                    temp.add(front.children.get(j).val);
                    q.add(front.children.get(j));
                }
            }
            if(temp.size()!=0) list.add(temp);
        }
        return list;
    }
}