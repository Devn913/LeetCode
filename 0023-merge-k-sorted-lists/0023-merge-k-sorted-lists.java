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
        ListNode head;

        Pair(ListNode head){
            this.head = head;
        }
        @Override
        public int compareTo(Pair p){
            return this.head.val - p.head.val;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int i = 0;i<lists.length;i++){
            ListNode head = lists[i];
            if(head!=null) pq.add(new Pair(head));
        }

        ListNode head = new ListNode(0);
        ListNode tail = head;
        while(pq.size()!=0){
            ListNode temp = pq.remove().head;
            if(temp.next!=null) pq.add(new Pair(temp.next));
            tail.next = temp;
            tail = tail.next;
        }
        tail.next = null;
        return head.next;
        

    }
}