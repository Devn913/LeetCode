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
    class pair{
        int val;
        int index;
        pair(int index, int val){
            this.index = index;
            this.val = val;
        }
    }
    public int[] nextLargerNodes(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        int[] res = new int[size];
        Stack<pair> s = new Stack<>();
        temp = head;
        size = 0;
        while(temp!=null){
            if(s.isEmpty()){
                s.push(new pair(size++,temp.val));
                temp = temp.next;
            }
            if(temp == null) return res;
            while(!s.isEmpty() && s.peek().val<temp.val){
                res[s.peek().index] = temp.val;
                s.pop();
            }
            s.push(new pair(size++,temp.val));
            temp = temp.next;
        }
        return res;
    }
}