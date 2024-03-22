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
    public boolean isPalindrome(ListNode head) {
     
        //copy data of linkedilist to arraylist and solve
        List <Integer> list = new ArrayList<>();
        
        //loop through linkedlist and copy to arraylist
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        
        //use two-pointer approach to check palindrome
        int left = 0;
        int right = list.size() - 1;
        while (left < right & list.get(left) == list.get(right)) {
            left++;
            right--;
        }
        
        return left >= right;
        
    }
}