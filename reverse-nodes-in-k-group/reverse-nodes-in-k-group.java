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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next == null || k == 1) return head;
        ListNode temp = head;
        int counter = 0;
        while(counter!=k-1){
            temp = temp.next;
            counter++;
            if(temp==null) break;
        }
        if(counter==k-1 && temp!=null) {
            ListNode next = temp.next;
            ListNode curr = head;
            temp.next = null;
            head = reverse(head);
            curr.next = reverseKGroup(next,k);
        }
        return head;
    }
}