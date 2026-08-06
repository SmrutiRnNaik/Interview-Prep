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
    public ListNode middleNode(ListNode head) {
        ListNode l = head , h = head ;
        if(head == null){
            return head ;
        }
        while(h!= null && h.next!=null){
            l=l.next ;
            h=h.next.next;
        }
        return l;
    }
}