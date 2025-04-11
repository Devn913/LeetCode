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
    public class Pair implements Comparable<Pair>{
        int val;
        ListNode head;

        Pair(int val, ListNode head){
            this.val = val;
            this.head = head;
        }
        @Override
        public int compareTo(Pair p){
            return this.val - p.val;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int i = 0;i<lists.length;i++){
            ListNode head = lists[i];
            while(head!=null){
                pq.add(new Pair(head.val,head));
                head  = head.next;
            }
        }
        ListNode head = new ListNode(0);
        ListNode tail = head;
        while(pq.size()!=0){
            tail.next = pq.remove().head;
            tail = tail.next;
        }
        tail.next = null;
        return head.next;
        

    }
}