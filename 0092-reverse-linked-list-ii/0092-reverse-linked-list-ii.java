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
        if(head==null || head.next==null) return head;
        ListNode dummy=new ListNode(0,head);
        ListNode pre=dummy;
        for(int i=0;i<left-1;i++){
            pre=pre.next;
        }
        ListNode p=pre;
        ListNode q=pre.next;
        ListNode qHead=q;
       
        for(int i=0;i<right-left+1;i++){
            ListNode curr=qHead.next;
            qHead.next=pre;
            pre=qHead;
            qHead=curr;
        }
        p.next=pre;
        q.next=qHead;
        return dummy.next;


    }
}