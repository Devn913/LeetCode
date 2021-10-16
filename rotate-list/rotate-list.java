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
    
    public ListNode rotateList(ListNode head, int k){
        if(k==0) return head;
        ListNode temp = head;
        while(temp.next.next != null) temp = temp.next;
        ListNode temp2 = temp.next;
        temp.next = null;
        temp2.next = head;
        head = temp2;
        return rotateRight(head,--k);
    }
    
    public ListNode rotateRight(ListNode head, int k) {
        if(head ==null || head.next == null) return head;
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            temp = temp.next;
            size ++;
        }
        k = k%size;
        return rotateList(head,k);
    }
}