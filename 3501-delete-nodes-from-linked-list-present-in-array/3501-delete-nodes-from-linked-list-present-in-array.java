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
    public ListNode helper(HashSet<Integer> set, ListNode head){
        if(head == null) return head;
        if(set.contains(head.val)) return helper(set, head.next);
        head.next = helper(set, head.next);
        return head;
    }
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        return helper(set, head);
    }
}