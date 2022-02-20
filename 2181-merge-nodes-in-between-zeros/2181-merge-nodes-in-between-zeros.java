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
    public ListNode mergeNodes(ListNode head) {
        ListNode head2 = head;
        head = head.next;
        while(head!=null){
            ListNode temp = head;
            head = head.next;
            while(head.val!=0){
                temp.val+=head.val;
                head = head.next;
            }
            head = head.next;
            temp.next = head;
        }
        return head2.next;
    }
}