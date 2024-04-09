class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        
        //create & initialize the queue with ticket indices 
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < tickets.length; i++) {
            queue.add(i);
        }
        
        int time = 0;
        
        //loop until the queue is empty
        while(!queue.isEmpty()) {
            
            //increment the time;
            time++;
            
            // get the front element of queue
            int front = queue.poll();
            
            //buy a ticket for front person, decrement the ticket count
            tickets[front]--;
            
            //if k is finished buying tickets, return time
            if(k == front && tickets[front] == 0) {
                return time;
            }
            
            //if more tickets to buy for front, then re-add the index front to queue
            if(tickets[front] != 0) {
                queue.add(front);
            }
            
        }
        
        return time;
        
    }
}