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
    public ListNode partition(ListNode head, int x) {
        ListNode temp = head;
        ListNode before = new ListNode();
        ListNode after = new ListNode();
        ListNode beforetemp = before;
        ListNode aftertemp = after;
        
        while(temp!=null){
            if(temp.val<x){
                beforetemp.next = temp;
                beforetemp = beforetemp.next;
            }else{
                aftertemp.next = temp;
                aftertemp = aftertemp.next;
            }
            temp = temp.next;
        }
        aftertemp.next = null;
        beforetemp.next = after.next;
        return before.next;
    }
}