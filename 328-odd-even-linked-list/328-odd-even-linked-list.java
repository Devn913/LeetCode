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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        ListNode head2 = head.next;
        ListNode temp2 = head2;
        while(temp!=null && temp2!=null && temp2.next!=null){
            temp.next = temp2.next;
            temp2.next = temp2.next.next;
            temp = temp.next;
            temp2 = temp2.next;
        }
        temp.next = head2;
        return head;

    }
}