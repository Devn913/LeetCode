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
        // // Approach 1: Copy Linked list to array.
        // // TC : O(N)
        // // SC : O(N)
        // // Initialize a list
        // ArrayList<Integer> list = new ArrayList<>();
        // // Traversal
        // ListNode temp = head;
        // while(temp!=null){
        //     list.add(temp.val);
        //     temp = temp.next;
        // }
        // temp = head;
        // for(int i = list.size()-1;i!=-1;i--){
        //     System.out.println(list.get(i));
        //     temp.val = list.get(i);
        //     temp = temp.next;
        // }
        // return head;


        // Approach 2: Optimial

        if(head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head.next;
        while(next!=null){
            curr.next = prev;
            prev  =curr;
            curr = next;
            next = next.next;
        } 
        curr.next = prev;
        return curr;

    }
}