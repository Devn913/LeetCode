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
    public int gcd(int a, int b)
    {
        // if b=0, a is the GCD
        if (b == 0)
            return a;
 
        // call the gcd() method recursively by
        // replacing a with b and b with
        // modulus(a,b) as long as b != 0
        else
            return gcd(b, a % b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next == null) return head;
        
        int val1 = head.val;
        int val2 = head.next.val;
        int gcd = gcd(val1,val2);
        ListNode next = insertGreatestCommonDivisors(head.next);
        head.next = new ListNode(gcd,next);
        return head;
        
    }
}