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
    public class pair implements Comparable<pair>{
        public ListNode head;
        pair(ListNode head){
            this.head = head;
        }
        public int compareTo(pair p){
            return this.head.val - p.head.val;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        if(lists.length == 1) return lists[0];
        PriorityQueue<pair> pq = new PriorityQueue<>();
        for(int i =0;i<lists.length;i++){
            if(lists[i]!=null){
                pair p = new pair(lists[i]);
                pq.add(p);
            }

        }
        ListNode head = new ListNode();
        ListNode temp = head;
        while(pq.size()!=0){
            pair p = pq.remove();
            ListNode temp2 = p.head;
            temp.next = temp2;
            temp = temp.next;
            if(temp2.next !=null){
                p.head = temp2.next;
                pq.add(p);
            }
        }
        return head.next;
    }
}