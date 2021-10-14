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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode head = new ListNode();
        ListNode main = head;
        
        while(l1!=null || l2!=null){
            if(l1==null){
                main.next = l2;
                break;
            }else if(l2==null){
                main.next = l1;
                break;
            }else if(l1.val>l2.val){
                main.next = new ListNode(l2.val);
                l2 = l2.next;
            }else{
                main.next = new ListNode(l1.val);
                l1 = l1.next;
            }    
            main = main.next;
        }
        return head.next;
    }
}