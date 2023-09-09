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
        if(k == 0) return head;
        if(head == null|| head.next==null) return head;
        int size = 0;
        ListNode temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        temp = head;
        k = k%size;
        if(k == 0) return head;
        k = size - k;
        for(int i = 0;i<k-1;i++){
            temp = temp.next;
        }
        ListNode newHead = temp.next;
        temp.next = null;
        temp = head;
        head = newHead;
        ListNode temp2 = newHead;
        while(temp2.next!=null){
            temp2 = temp2.next;
        }
        temp2.next = temp;
        return newHead;
        
    }
}