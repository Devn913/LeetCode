/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        // Approach 1: HashMap

        HashMap<Node,Node> map = new HashMap<>();
        Node temp = head;  
        Node res = new Node(0);
        Node temp2 = res;
        while(temp!=null){
           res.next = new Node(temp.val);
           res = res.next;
           map.put(temp,res);
           temp = temp.next;
        }
        temp = head;
        res = temp2.next;
        while(temp!=null){
            res.random = map.get(temp.random);
            temp = temp.next;
            res = res.next;
        }
        return temp2.next;

    }
}