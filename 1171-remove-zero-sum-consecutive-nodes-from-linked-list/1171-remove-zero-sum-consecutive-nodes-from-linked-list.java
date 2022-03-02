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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0), cur = dummy;
        dummy.next = head;
        int prefix = 0;
        Map<Integer, ListNode> m = new HashMap<>();
        while (cur != null) {
            prefix += cur.val;
            if (m.containsKey(prefix)) {
                cur =  m.get(prefix).next;
                int p = prefix + cur.val;
                while (p != prefix) {
                    m.remove(p);
                    cur = cur.next;
                    p += cur.val;
                }
                m.get(prefix).next = cur.next;
            } else {
                m.put(prefix, cur);
            }
            cur = cur.next;
        }
        return dummy.next;
        
    }
}