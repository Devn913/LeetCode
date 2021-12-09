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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;
        int counter = 1;
        while(counter!=a){
            temp = temp.next;
            ++counter;
        }
        ListNode temp2 = temp.next;
        temp.next = list2;
        while(temp.next!=null){
            temp = temp.next;
        }
        while(counter!=b){
            temp2 = temp2.next;
            ++counter;
        }
        temp.next = temp2.next;
        return list1;
        
    }
}