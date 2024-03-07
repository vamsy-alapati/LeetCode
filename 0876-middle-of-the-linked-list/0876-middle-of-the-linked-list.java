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
    
    public int lengthOfList(ListNode head) {
        int len = 0;
        while(head != null) {
            len++;
            head = head.next;
        }
        
        return len;
    }
    
    public ListNode middleNode(ListNode head) {
        
        int middle = lengthOfList(head)/2;
        
        while(middle > 0) {
            middle--;
            head = head.next;
        }
        
        System.out.println(lengthOfList(head));
        return head;
    }
}