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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next == null) return head;
        ListNode res = new ListNode();
        ListNode prev = res;
        res.next = head;
        while(head!=null && head.next!=null){
            if(head.val != head.next.val){
                prev = prev.next;
                head = head.next;
            }else{
                while(head.next!= null && head.val == head.next.val){
                    head = head.next;
                }
                prev.next = head.next;
                head = prev.next;
            }
        }
        return res.next;
    }
}