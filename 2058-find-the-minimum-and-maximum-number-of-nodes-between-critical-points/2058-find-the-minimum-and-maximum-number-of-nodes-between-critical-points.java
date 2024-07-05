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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = {-1,-1};
        int min = Integer.MAX_VALUE;
        int max = 0;
        int firstCriticalValIndex = -1;
        int prevToLastIndex = -1;
        int lastCriticalValIndex = -1;
        int prevVal = head.val;
        head = head.next;
        int currentVal = head.val;
        int nextVal = -1;
        int currentIndex = 1;
        while(head.next!=null){
            nextVal = head.next.val;
            if((currentVal>prevVal && currentVal>nextVal) || (currentVal<prevVal&& currentVal<nextVal)){
                if(firstCriticalValIndex==-1){
                    firstCriticalValIndex = currentIndex;
                }
                prevToLastIndex = lastCriticalValIndex;
                lastCriticalValIndex = Math.max(lastCriticalValIndex,currentIndex);
                if(prevToLastIndex!=lastCriticalValIndex && prevToLastIndex!=-1 ){
                    min = Math.min(min,lastCriticalValIndex-prevToLastIndex);
                }
            
            }
            prevVal =currentVal;
            currentVal = nextVal;
            head= head.next;
            currentIndex++;
        }
        if(firstCriticalValIndex!=lastCriticalValIndex && lastCriticalValIndex!=-1){
            ans[0] = min;
            ans[1] = lastCriticalValIndex-firstCriticalValIndex;
        }
        return ans;
    }
}