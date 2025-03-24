/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* oddEvenList(ListNode* head) {
        if(!head || !head->next) return head;
        ListNode *even=head->next,*odd=head,*temp=even;
        while(odd->next && odd->next->next){
            ListNode *nodd=even?even->next:nullptr;
            ListNode *neven=nodd?nodd->next:nullptr;
            if(even)
            even->next=neven;
            if(odd)
            odd->next=nodd;
            even=neven;
            odd=nodd;
        }
        odd->next=temp;
        return head;
    }
};