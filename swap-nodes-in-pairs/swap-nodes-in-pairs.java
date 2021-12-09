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
        if(head==null || head.next == null) return head;
        ListNode l1 = head;
        ListNode l2 = head.next;
        ListNode prev = null;
        head = l2;
        while(l1!=null && l2!=null){
            l1.next = l2.next;
            l2.next = l1;
            prev = l1;
            l1 = l1.next;
            if(l1 == null || l1.next == null) break;
            l2 = l1.next;
            prev.next = l2;
        }
        return head;
    }
}