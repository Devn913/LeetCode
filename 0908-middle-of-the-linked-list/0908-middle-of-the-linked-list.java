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
    public ListNode middleNode(ListNode head) {
        // Approach 1: Count  (Iteratively)
        if(head == null) return null;
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        int middleIndex = (count)/2;
        temp = head;
        while(middleIndex !=0){
            temp = temp.next;
            middleIndex--;
        }
        return temp;
    }
}