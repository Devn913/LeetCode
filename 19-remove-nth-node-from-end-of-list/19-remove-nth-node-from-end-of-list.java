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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            len++;
        }
        if(len == n) return head.next;
        len = len - n;
        temp = head;
        while(len!=1){
            temp = temp.next;
            len--;
        }
        temp.next = temp.next.next;
        return head;
    }
}