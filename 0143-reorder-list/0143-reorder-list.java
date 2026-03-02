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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode curr=slow.next; //2nd half of beginnning
        slow.next=null;
        ListNode pre=null;
        while(curr!=null){
            ListNode t=curr.next;
            curr.next=pre;
            pre=curr;
            curr=t;
        }
        curr=head;
        while(pre!=null){
            ListNode t=pre.next;
            pre.next=curr.next;
            curr.next=pre;
            curr=pre.next;
            pre=t;
        }
        
    }
}