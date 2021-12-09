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
        if(head ==null || head.next==null) return head;
        ListNode prev = null;
        ListNode current = head;
        ListNode next = head.next;
        while(next!=null){
            current.next = prev;
            prev = current;
            current = next;
            next = next.next;
        }
        current.next = prev;
        return current;
    }
    
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp = head;
        ListNode prev = null;
        int counter = 1;
        while(counter!=left){
            prev = temp;
            temp = temp.next;
            counter++;
        }
        ListNode rev = temp;
        while(counter!=right){
            temp = temp.next;
            counter++;
        }
        ListNode tail = temp.next;
        temp.next = null;
        ListNode newHead = reverse(rev);
        rev.next = tail;
        if(prev==null){
            head = newHead;
        }else{
            prev.next = newHead;
        }
        return head;
        
    }
}