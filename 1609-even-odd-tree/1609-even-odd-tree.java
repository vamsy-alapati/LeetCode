/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        
        //edge case 
        if(root == null) return true;

        //create a queue to store all the elements at each level
        Queue <TreeNode> queue = new LinkedList<>();
        boolean flag = true;
        queue.offer(root);

        //while the queue not empty, process each node and check if the tree satisfies the conditions
        while(!queue.isEmpty()) {
            
            // size of the queue to run the for loop
            int size = queue.size();
            
            // initialize prev to MIN or MAX value depending of if flag is true or false
            int prev = flag ? Integer.MIN_VALUE : Integer.MAX_VALUE; 

            //poll each element in the level, do the checks return false if fails or load the next nodes into queue
            for (int i=0; i<size; i++) {
                //fetching the current node from queue
                TreeNode node = queue.poll();
                
                //if flag is true -> even level
                if(flag) {  //even level -> all elements in this level should be odd and curr element strictly > previous
                    if(node.val % 2 == 0 || node.val <= prev) {
                        return false;
                    }
                }
                //odd level -> all elements in this level should be even and curr element strictly < previous
                else {
                    if (node.val % 2 != 0 || node.val >= prev) {
                        return false;
                    }
                }
    
                //if the node.left has a node then load into queue
                if(node.left != null) {
                    queue.offer(node.left);
                }
                
                //if the node.right has a node then load into queue
                if(node.right != null) {
                    queue.offer(node.right);
                }
                
                //update the prev to current node val for next iteration
                prev = node.val;
            }

            //toggle the flag for next level
            flag = !flag;
        }
        // return true if the loop was successfully completed without returning false
        return true;
    }
}