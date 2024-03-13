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
        
        //create a ListNode start and assign next to head
        ListNode start = new ListNode();
        start.next = head;
        
        ListNode fast = start, slow = start;
        
        //advancing the fast node 'n' positions ahead of slow node
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        
        //progress both fast and slow nodes until fast reaches end
        // this makes the distance between slow and fast is n nodes
        // and slow.next node is the nth node from the end we need to remove
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        //removing the nth node
        slow.next = slow.next.next;
        
        
        //return the head again;
        return start.next;
        
    }
}