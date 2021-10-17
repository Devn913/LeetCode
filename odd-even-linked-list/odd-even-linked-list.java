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
        if(head == null || head.next==null) return head;
        ListNode oddH = head;
        ListNode evenH = head.next;
        ListNode oddT = head;
        ListNode evenT = head.next;
        head = head.next.next;
        while( head!=null){
            oddT.next = head;
            evenT.next = head.next;
            if(head.next !=null) head = head.next.next;
            else break;
            oddT = oddT.next;
            evenT = evenT.next;
        }
        if(head!=null) {
            oddT.next = head;
            oddT = oddT.next;
        }
        oddT.next = evenH;
        evenT.next = null;
        return oddH;
    }
}