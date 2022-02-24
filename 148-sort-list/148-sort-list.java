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
// class Solution {
//     public ListNode mergeTwoLists(ListNode l1, ListNode l2){
//         if(l1==null) return l2;
//         if(l2==null) return l1;
//         if(l1.val>l2.val){
//             ListNode temp = l1;
//             l1 = l2;
//             l2 = temp;
//         }
//         ListNode res = l1;
//         ListNode temp  = l1;
//         l1 = l1.next;
//         while(l2!=null){
//             if(l1 == null){
//                 temp.next = l2;
//                 break;
//             }
//             if(l1.val>l2.val){
//                 temp.next = l2;
//                 l2 =l2.next;
//                 temp = temp.next;
//                 temp.next = l1;
//             }else{
//                 temp = l1;
//                 l1 = l1.next;
//             }
//         }
//         return res;   
//     }
    
//     public ListNode sortList(ListNode head) {
//         if(head==null || head.next==null) return head;
//         ListNode prev = null;
//         ListNode slow = head;
//         ListNode fast = head;
//         while(fast!=null && fast.next !=null){
//             prev = slow;
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         prev.next = null;
//         ListNode l1 = sortList(head);
//         ListNode l2 = sortList(slow);
//         return mergeTwoLists(l1,l2);
//     }
// }
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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next == null) return head;
        int size = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        int[] arr = new int[size--];
        temp = head;
        while(temp!=null){
            arr[size--] = temp.val;
            temp =  temp.next;
        }
        Arrays.sort(arr);
        temp = head;
        while(temp!=null){
            temp.val = arr[++size];
            temp =temp.next;
        }
        return head;
        
    }
}