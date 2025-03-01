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
        if(head == null ) return head;
        if(head.next == null){
            if(head.random == null){
                return new Node(head.val);
            }else{
                Node head2 = new Node(head.val);
                head2.random = head2;
                return head2;
            }
        }
        Node curr = head;
        Node next = curr;
        while(curr!=null){
            next = curr.next;
            curr.next = new Node(curr.val);
            curr.next.next = next;
            curr  = next;
        }
        curr = head;
        while(curr!=null){
            next = curr.next;
            if(curr.random ==null){
                next.random = null;
                curr = next.next;
                continue;
            }
            next.random = curr.random.next;
            curr = next.next;
        }
        Node prev = head;
        curr = head.next;
        Node res = curr;
        while(prev!=null){
            curr = prev.next;
            next = curr.next;
            prev.next = curr.next;
            if(next==null){
                curr.next = null;
            }else{
                 curr.next = next.next;
            }
            prev = prev.next;
            
        }
        return res;
        
    }

}