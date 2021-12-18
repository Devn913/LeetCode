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
    public ListNode h;
    public int size;

    public Solution(ListNode head) {
        h = head;
        size = 0;
        while(head!=null){
            size++;
            head = head.next;
        }
    }
    
    public int getRandom() {
        int counter = (int) ((Math.random() * (size - 0)) + 0);
        ListNode temp = h;
        while(counter!=0){
            temp = temp.next;
            counter--;
        }
        return temp.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */