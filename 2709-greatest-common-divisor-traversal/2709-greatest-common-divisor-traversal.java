class Solution {
    
    Map<Integer, List<Integer>> prime2index = new HashMap<>();
    Map<Integer, List<Integer>> index2prime = new HashMap<>();
    
    //DFS method to traverse the graph
    void dfs(int index, boolean[] visitedIndex, Map<Integer, Boolean> visitedPrime) {
        
        //if index is already visited, return
        if(visitedIndex[index]) return;
        
        //if not, mark the index as visited and continue to logic
        visitedIndex[index] = true;
        
        //loop through all prime factors of this number
        for (int prime : index2prime.getOrDefault(index, new ArrayList<>())) {
            
            
            //if prime factor is visited, then continue
            if(visitedPrime.getOrDefault(prime, false)) {
                continue;
            }
            
            //mark prime as visited as visiting now and proceed with logic
            visitedPrime.put(prime, true);
            
            //Loop through all indices that have this prime factor in common, adjacent index
            for(int adjacentIndex : prime2index.getOrDefault(prime, new ArrayList<>())) {
                
                
                //if adjacent index is already visited, continue to next
                if(visitedIndex[adjacentIndex]) continue;
                
                //else call DFS for the adjacent index
                dfs(adjacentIndex, visitedIndex, visitedPrime);
                
            }
        }
    }
    
    public boolean canTraverseAllPairs(int[] nums) {
        
        
        //find all the prime factors for each element in the nums array
        // create two mappings prime2index and index2prime
        for (int i=0; i < nums.length; i++) {
            int temp = nums[i];
            for(int j=2; j*j <= nums[i]; j++) {
                if(temp % j == 0) {
                    prime2index.computeIfAbsent(j, k -> new ArrayList<>()).add(i);
                    index2prime.computeIfAbsent(i, k -> new ArrayList<>()).add(j);
                    while (temp % j == 0) {
                        temp = temp/j;
                    }
                }    
            }
            if( temp > 1 ) {
                prime2index.computeIfAbsent(temp, k -> new ArrayList<>()).add(i);
                index2prime.computeIfAbsent(i, k -> new ArrayList<>()).add(temp);
            }
        }
        
        // run DFS (Depth First Search) from 0th index
        boolean[] visitedIndex = new boolean[nums.length];
        Map<Integer, Boolean> visitedPrime = new HashMap<>();
        dfs(0, visitedIndex, visitedPrime);
        
        //check if all the indices are visited
        for (boolean index : visitedIndex) {
            if(!index) {
                return false;
            }
        }
        
        return true;
    }
}