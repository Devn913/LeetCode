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
    public ListNode reverseList(ListNode head) {
        // Approach 1: Cope Linked list to array.
        // Initialize a list
        ArrayList<Integer> list = new ArrayList<>();
        // Traversal
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        temp = head;
        for(int i = list.size()-1;i!=-1;i--){
            System.out.println(list.get(i));
            temp.val = list.get(i);
            temp = temp.next;
        }
        return head;

    }
}