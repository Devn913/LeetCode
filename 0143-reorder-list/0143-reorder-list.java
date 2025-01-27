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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null ) return;
        // use turtle rabbit method, slow-fast pointer to find middle of the linkedlist 
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next; // move once
            fast = fast.next.next; // move twice faster 
        }
        // Divide the linkedList into two parts;
        ListNode secondHalf = slow.next;
        // Set first half next to null to deattach the flist 
        slow.next = null;
        // reverse the second half
        secondHalf = reverse(secondHalf);
        ListNode firstHalf  = head;
        ListNode temp = secondHalf;
        // combinig both list
        while(secondHalf!=null){
            temp = temp.next;
            secondHalf.next = firstHalf.next;
            firstHalf.next  = secondHalf;
            firstHalf = secondHalf.next;
            secondHalf = temp;
        }
        return;


    }
}