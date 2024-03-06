/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //edge cases
        if(head == null || head.next == null) {
            return false;
        }

        //Floyd's tortoise and hare algorithm to detect cycles
        // initialize the slow and fast to head
        ListNode slow = head;
        ListNode fast = head;

        //travesing the list, slow by one node and fast by two nodes at a time
        // if cycle exists then they are bound to meet and be equal
        while(fast.next != null && fast.next.next != null && slow.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            //if meeting then equal and cycle exists
            if(slow == fast) {
                return true;
            }
        }

        //exited the while loop means there is no cycle
        return false;
    }
}