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
    

    
    public ListNode rotateRight(ListNode head, int k) {
        if(head ==null || head.next == null|| k==0) return head;
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            temp = temp.next;
            size ++;
        }
        k = k%size;
        if(k==0) return head;
        temp = head;
        int counter = 0;
        while(counter<size-k-1){
            temp = temp.next;
            counter++;
        }
        ListNode temp2  =temp.next;
        temp.next = null;
        temp = temp2;
        while(temp.next != null) temp = temp.next;
        temp.next = head;
        head = temp2;
        return head;
    }
}