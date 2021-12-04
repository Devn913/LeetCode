/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head == null){
            return head;
        }
        if(head.child!=null){
            Node next = head.next;
            Node temp = flatten(head.child);
            head.child = null;
            head.next  = temp;
            temp.prev = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = next;
            if(next!=null) next.prev = temp;   
        }else{
            head.next= flatten(head.next);
        }
        return head;
    }
}