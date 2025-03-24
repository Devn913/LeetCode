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
    //   null <- 1<- 2<-3  null
    //               p  c n
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
 // 1->2
 // 1->2->3
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next !=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        slow = reverse(slow);

        ListNode temp = head;
        while(temp!=null && slow!=null){
            if(temp.val!=slow.val) return false;
            temp = temp.next;
            slow = slow.next;
        }
        return true;


    } 
}