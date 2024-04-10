class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        
        int N = deck.length;
        
        Queue<Integer> queue = new LinkedList<>();
        
        //load all indices to queue
        for (int i = 0; i < N; i++) {
            queue.add(i);
        }
        
        //sort the array
        Arrays.sort(deck);
        
        //declare result
        int [] result = new int[N];
        for(int i = 0; i < N; i++) {
            
            //reveal call by poll and place in result
            result[queue.poll()] = deck[i];
            
            //move the next card to bottom
            queue.add(queue.poll());
            
        }
        
        return result;
        
    }
}