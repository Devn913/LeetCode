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
    public ListNode[] splitListToParts(ListNode head, int k) {
        // if(k == 1){

        // }
        int size = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        int splitSize = size / k;
        int numRemainingParts = size % k;

        ListNode[] result = new ListNode[k];
        result[0] = head;
        ListNode prev = null;
        for(int i = 0;i<k;i++){
            result[i] = head;
            int groupSize = splitSize;
            if (numRemainingParts > 0) {
                numRemainingParts--;
                groupSize++;
            }
            int j = 0;
            while(head!=null && j<groupSize){
                prev = head;
                head = head.next;
                j++;
            } 
            if(prev!=null) prev.next = null;
        }
        return result;



    }
}