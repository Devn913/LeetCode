/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head.next;
        while(next!=null){
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }
        curr.next = prev;
        return curr;
    }
    public ListNode removeNodes(ListNode head) {
        if(head == null || head.next == null) return head;
        head = reverse(head);
        int max = head.val;
        ListNode prev = null;
        ListNode temp = head;
        ListNode next = head.next;
        while(temp!=null){
            if(temp.val<max){
                prev.next = next;
                temp = next;
                if(next == null) break;
                next = next.next;
                continue;
            }
            max = Math.max(max,temp.val);
            prev = temp;
            temp = temp.next;
            if(next == null) break;
            
            next = next.next;
        }
        return reverse(head);
        
    }
}