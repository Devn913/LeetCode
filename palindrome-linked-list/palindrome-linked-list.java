/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 

   1 <- 2    3
         p    h  n          
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = head;
        slow = reverse(slow);
        while(slow!=null){
            if(slow.val != fast.val){
                return false;
            } 
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
    
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode next = head.next;
        while(next!=null){
            head.next = prev;
            prev = head;
            head = next;
            next = next.next;
        }
        head.next = prev;
        return head;
    }
}