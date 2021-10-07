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
        int size = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        if(size == 1 || size == n) return head.next;
        int counter =0;
        temp  = head;
        while(counter<size-n-1){
            counter++;
            temp = temp.next;
        }
        temp.next = (temp.next).next;
        return head;
    }
}