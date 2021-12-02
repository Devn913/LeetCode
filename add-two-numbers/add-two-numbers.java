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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = new ListNode();
        ListNode temp = head;
        while(l1!=null || l2!=null){
            int val1 = 0;
            int val2 = 0;
            if(l1!=null){
                val1 = l1.val;
                l1 = l1.next;
                
            } 
            if(l2!=null) {
                val2 = l2.val;
                l2 = l2.next;
                
            }
            int data = val1 + val2 +carry;
            if(data>9){
                carry = data/10;
                data = data%10;
            }else{
                carry = 0;
            }
            temp.next = new ListNode(data);
            temp = temp.next;
        }
        if(carry!=0) temp.next = new ListNode(carry);
        return head.next;
    }
}