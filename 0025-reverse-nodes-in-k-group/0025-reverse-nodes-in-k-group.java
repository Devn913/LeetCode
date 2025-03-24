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
        ListNode prev =  null;
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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k == 1) return head;
        if(head == null || head.next == null) return head;
        int count = 1;
        ListNode temp = head;
        while(temp.next!=null ){
            temp = temp.next;
            count++;
            if(count == k) break;
        }
        if(count<k){
            return head;
        }else{
            ListNode node = temp.next;
            node = reverseKGroup(node,k);
            temp.next = null;
            ListNode result = reverse(head);
            head.next = node;
            return result;
        }
    }
}