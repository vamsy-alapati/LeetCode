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
    public ListNode removeZeroSumSublists(ListNode head) {
        
        ListNode front = new ListNode(0, head);
        ListNode current = front;
        
        int prefixSum = 0;
        
        Map<Integer, ListNode> prefixSumToNode = new HashMap<>();
        
        while (current != null) {
            //add current val to prefix sum
            prefixSum += current.val;
            
            //if the prefixSum already exists in the HashMap then we have a zero sum nodes
            if(prefixSumToNode.containsKey(prefixSum)) {
                ListNode prev = prefixSumToNode.get(prefixSum);
                //set current to previously prefix sum node, so you can start deleting nodes
                current = prev.next;
                
                //delete the zero sum nodes from hashmap
                //to prevent incorrect deletions from linked list
                
                int p = prefixSum + current.val;
                while(p != prefixSum) {
                    prefixSumToNode.remove(p);
                    current = current.next;
                    p += current.val;
                }
                
                //make connection from prev node to the current node after deletions
                prev.next = current.next;
            }
            //if the prefixSum doesn't exist then add the elements to HashMap
            else {
                prefixSumToNode.put(prefixSum, current);
            }
            
            current = current.next;
        }
        
        return front.next;
        
    }
}