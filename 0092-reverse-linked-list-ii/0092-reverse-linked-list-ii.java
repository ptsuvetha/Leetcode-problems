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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right){
            return head;
        }
        ListNode dummy=new ListNode(0,head);
        ListNode pre=dummy;
        for(int i=0;i<left-1;i++){
            pre=pre.next;
        }
        ListNode p=pre;
        ListNode q=pre.next;
        ListNode curr=q;
        for(int i=0;i<right-left+1;i++){
            ListNode f=curr.next;
            curr.next=pre;
            pre=curr;
            curr=f;
        }
        p.next=pre;
        q.next=curr;
        return dummy.next;
    }
}