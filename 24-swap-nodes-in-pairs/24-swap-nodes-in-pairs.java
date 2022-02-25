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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next ==null)  return head;
        head.next.next = swapPairs(head.next.next);
        ListNode temp = head.next;
        head.next = temp.next;
        temp.next = head;
        head = temp;
        return head;
    }
}