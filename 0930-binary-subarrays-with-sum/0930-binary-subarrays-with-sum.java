class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        //track the subarray count
        int totalCount = 0;
        
        //track current sum up until a specific index
        int currSum = 0;
        
        Map<Integer, Integer> freq = new HashMap<>();
        
        for (int n : nums) {
            
            currSum += n;
            // if current sum is goal, then increment subset count
            if(currSum == goal) {
                totalCount++;
            }
            
            //check if any prefix sum that can be subtracted to get another subset
            if(freq.containsKey(currSum - goal)) {
                totalCount += freq.get(currSum - goal);
            }
            
            freq.put(currSum, freq.getOrDefault(currSum, 0) + 1);
            
        }
        
        return totalCount;
        
    }
}