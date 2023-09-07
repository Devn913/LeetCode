class Solution {
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode next = head.next;
        ListNode curr = head;
        ListNode prev = null;
        while(next != null){
            curr.next = prev;
            prev  = curr;
            curr = next;
            next = next.next;
        }
        curr.next = prev;
        return curr;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head;
        if(left == 1){
            int index = 1;
            ListNode temp = head;
            ListNode temp2 = head;
            while(index!=right){
                temp2 = temp2.next;
                index++;
            }   
            ListNode last = temp2.next;
            temp2.next = null;
            head = reverse(head);
            temp.next = last;
            return head;

        }
        ListNode temp = head;
        int index = 1;
        while(index!=left-1){
            temp = temp.next;
            index++;
        }

        ListNode temp2 = temp;
        while(index!=right){
            temp2 = temp2.next;
            index++;
        }
        if(temp2.next == null){
            ListNode reverseHead =temp.next;
            temp.next = reverse(reverseHead);
        }else{
            ListNode reverseHead = temp.next;
            ListNode last = temp2.next;
            temp2.next = null;
            temp.next = reverse(reverseHead);
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = last;
        }
        return head;
        
    }
}