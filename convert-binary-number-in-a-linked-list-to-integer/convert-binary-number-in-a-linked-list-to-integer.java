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
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int twoS = 1;
        while(temp.next!=null){
            temp = temp.next;
            twoS = twoS*2;
        }
        temp = head;
        int result= 0;
        while(temp!=null){
            result = result + (temp.val)*twoS;
            twoS = twoS/2;
            temp = temp.next;
        }
        return result;
    }
}