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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null){
            return head;
        }
        if(head.next==null){
            return null;
        }
        ListNode prev=null;
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        //System.out.println(length);
        int mid=length/2;
        temp=head;
        for(int i=0;i<=mid;i++){
            if(i==mid){
                prev.next=temp.next;
                break;
            }
            prev=temp;
            temp=temp.next;
            
        }
        return head;
    }
}