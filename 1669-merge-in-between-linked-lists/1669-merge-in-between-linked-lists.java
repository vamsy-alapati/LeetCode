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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        //initialize dynamic merge array 
        List<Integer> mergeArray = new ArrayList<>();
        
        //add nodes of list1 before a to the merge array
        int index = 0;
        ListNode curr1 = list1;
        while (index < a) {
            mergeArray.add(curr1.val);
            curr1 = curr1.next;
            index++;
        }
        
        //add all nodes of list2 to merge array
        ListNode curr2 = list2;
        while( curr2 != null ) {
            mergeArray.add(curr2.val);
            curr2 = curr2.next;
        }
        
        //move the index of curr1 to after b without adding to merge array
        //these will be skipped
        while (index < b + 1) {
            curr1 = curr1.next;
            index++;
        }
        
        //now add the remaining nodes of list1 after b to merge array
        while (curr1 != null) {
            mergeArray.add(curr1.val);
            curr1 = curr1.next;
        }
        
        //build a new linkedlist with all the nodes present in the merge array
        //we do it in reverse order so we can specify the next node in constructor
        ListNode result = null;
        for (int i = mergeArray.size() - 1; i >= 0; i--) {
            ListNode newNode = new ListNode(mergeArray.get(i), result);
            result = newNode;
        }
        
        return result;
        
        
    }
}