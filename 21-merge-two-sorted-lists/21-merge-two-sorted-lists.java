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
      
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1.val>l2.val){
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        ListNode res = l1;
        ListNode temp  = l1;
        l1 = l1.next;
        while(l2!=null){
            if(l1 == null){
                temp.next = l2;
                break;
            }
            if(l1.val>l2.val){
                temp.next = l2;
                l2 =l2.next;
                temp = temp.next;
                temp.next = l1;
            }else{
                temp = l1;
                l1 = l1.next;
            }
        }
        return res;
        
    }
    
    
}