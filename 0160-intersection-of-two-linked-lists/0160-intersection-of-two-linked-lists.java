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
    public int getSize(ListNode head){
        int size = 0;
        ListNode temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        return size;
    }

    public ListNode getNthNode(ListNode head, int index){
        ListNode temp = head;
        while(index!=0){
            temp = temp.next;
            index--;
        }
        return temp;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // int size1 = getSize(headA);
        // int size2 = getSize(headB);

        // int diff = Math.abs(size1 - size2);

        // if(size1>size2){
        //     headA = getNthNode(headA, diff);
        // }else{
        //     headB = getNthNode(headB, diff);
        // }

        // while(headA!=null && headB != null && headA!=headB){
        //     headA = headA.next;
        //     headB = headB.next;
        // }

        // return headA;


        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1!=temp2){
            temp1 = temp1==null  ? headA : temp1.next;
            temp2 = temp2 == null? headB : temp2.next;
        }
        return temp1;
    }
}