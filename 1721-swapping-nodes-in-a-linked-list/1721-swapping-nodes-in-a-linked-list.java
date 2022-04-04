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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int len = 0;
        int main1 = 0;
        while(temp!=null){
            if(len==k-1){
                main1 = temp.val;
            }
            temp = temp.next;
            len++;
        }
        int counter = 0;
        temp = head;
        while(counter!=len-k){
            temp = temp.next;
            counter++;
        }
        int val2 = temp.val;
        temp.val = main1;
        counter=0;
        temp = head;
        while(counter<k-1){
            temp = temp.next;
            counter++;
        }
        temp.val = val2;
        return head;
        
    }
}