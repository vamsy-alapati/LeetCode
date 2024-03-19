class Solution {
    public int leastInterval(char[] tasks, int n) {
     
        int [] freq = new int[26];
        //iterate through the array and write freqs in the array 
        for (char ch : tasks) {
            freq[ch - 'A']++;
        }
        
        //priority queue to store frequencies
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < 26; i++) {
            if(freq[i] > 0) {
                pq.offer(freq[i]);
            }
        }
        
        int time = 0;
        //process tasks until pq is empty
        while (!pq.isEmpty()) {
            int cycle = n + 1;
            List<Integer> store = new ArrayList<>();
            int taskCount = 0;
            //execute tasks in each cycle
            while (cycle-- > 0 && !pq.isEmpty()) {
                int currentFreq = pq.poll();
                if (currentFreq > 1) {
                    store.add(currentFreq - 1);
                }
                taskCount++;
            }
            
            //restore updated freqs in priority queue
            store.forEach(pq::offer);
            
            //add time for completed cycle
            time += (pq.isEmpty() ? taskCount : n + 1);
        }
        
        return time;
    }
}