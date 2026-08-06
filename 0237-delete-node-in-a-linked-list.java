/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // we will store the next node value in current node
        node.val = node.next.val ;
        // then we will store the next node reference in the current node
        node.next = node.next.next ;
        // garbage collector will do the rest of the work
    }
}