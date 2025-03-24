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
    public ListNode helper(boolean[] freq, ListNode head){
        if(head == null) return head;
        if(head.val<freq.length && freq[head.val]) return helper(freq, head.next);
        head.next = helper(freq, head.next);
        return head;
    }
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        int max = -1;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        // Create a boolean lookup table
        boolean[] freq = new boolean[max + 1];
        for (int num : nums) freq[num] = true;
        return helper(freq, head);
    }
}