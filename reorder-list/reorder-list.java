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
        curr.next =prev;
        return curr;
    }
    public void reorderList(ListNode head) {
        if(head==null || head.next == null) return;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = reverse(slow);
        slow.next  = null;
        ListNode res = head;
        ListNode n1 = head.next;
        ListNode n2 = head2.next;
        while(n1!=null&& n2!=null){
            head.next = head2;
            head2.next = n1;
            head = n1;
            head2 = n2;
            n1 = n1.next;
            n2 = n2.next;
        }
        head.next = head2;
        head2.next = null;
    
    }
}