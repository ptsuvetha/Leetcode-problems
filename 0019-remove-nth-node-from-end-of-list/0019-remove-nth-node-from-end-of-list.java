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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int l=0;
        while(temp!=null){
            temp=temp.next;
            l++;
        }
        ListNode curr=head;
        int c=l-n;
        int count=1;
        if(c==0){
            ListNode newHead=head.next;
            head=null;
            return newHead;
        }
        while(curr!=null){
            if(c==count){
                ListNode delNode=curr.next;
                curr.next=curr.next.next;
                delNode=null;
                break;
            }
            count++;
            curr=curr.next;
            
        }
        return head;
    }
}