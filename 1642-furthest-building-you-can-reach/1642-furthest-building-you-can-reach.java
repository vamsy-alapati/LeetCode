class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        
        // Create a priority queue which sorts elements in descending order
        PriorityQueue<Integer> pQueue = new PriorityQueue<>((a, b) -> b - a);
        
        int i = 0, diff = 0;
        
        for (i = 0; i < heights.length - 1; i++) {
            // calculate the difference of height with the next building
            diff = heights[i + 1] - heights[i]; 
            
            // if the next building is small than current building (negative val)
            // then move to the next building
            if (diff <= 0) {
                continue;
            }

            // calculate if we can use bricks or not
            bricks = bricks - diff; // updating the bricks to new val after using
            pQueue.offer(diff);
            
            // check if the bricks are not sufficient to cross (negative val)
            // then use ladders instead of 
            if(bricks < 0) {
                bricks = bricks + pQueue.poll();
                // pQueue.pop();
                ladders = ladders - 1;
            }
            
            // if there are not enough ladders then break and 
            // return previous value of i (building number)
            if(ladders < 0) {
                break;
            }
        }
        
        return i;
        
    }
}