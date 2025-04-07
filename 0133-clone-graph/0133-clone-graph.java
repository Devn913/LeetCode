/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneHelper(Node node, HashMap<Node,Node> visited){
        if(node == null) return node;
        if(visited.containsKey(node)) return visited.get(node);

        Node cloned = new Node(node.val);
        visited.put(node,cloned);
        for(int i = 0;i<node.neighbors.size();i++){
            cloned.neighbors.add(cloneHelper(node.neighbors.get(i),visited));
        }
        return cloned;
    }
    public Node cloneGraph(Node node) {
        HashMap<Node,Node> map = new HashMap<>();
        return cloneHelper(node,map);
    }
}