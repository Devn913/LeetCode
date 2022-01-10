/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int size(ListNode head){
        ListNode temp = head;
        int counter = 0;
        while(temp!=null){
            temp = temp.next;
            counter++;
        }
        return counter;
    }
    public ListNode nthNode(ListNode head, int n){
        ListNode temp = head;
        while(n--!=0) temp = temp.next;
        return temp;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1 =size(headA);
        int size2 =size(headB);
        int common = Math.abs(size1-size2);
        if(size1>size2) headA = nthNode(headA,common);
        else if(size2>size1) headB = nthNode(headB,common);
        if(headA == headB) return headA;
        while(headA!=null && headB!=null){
            headA = headA.next;
            headB = headB.next;
            if(headA == headB) return headA;
        }
        
        return null;
    }
}