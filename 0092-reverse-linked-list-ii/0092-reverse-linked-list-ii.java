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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int i =1;
        int j =1;
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        if(left >= right){
            return head;
        }
        reverseBetween(head,left+1,right-1);
        ListNode curr1 = head;
        ListNode curr2 = head;
        while(i<left){
          curr1 = curr1.next;
          i++;
        }
        while(j<right){
            curr2 = curr2.next;
            j++;
        }
        int temp = curr1.val;
        curr1.val = curr2.val;
        curr2.val = temp;

        return head;
    }
}