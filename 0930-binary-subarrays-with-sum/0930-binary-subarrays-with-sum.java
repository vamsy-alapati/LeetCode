class Solution {
    public int slidingWindowAtMost(int[] nums, int goal) {
        
        //initialize start and currSum and totalCount to 0;
        int start = 0, currSum = 0,  totalCount = 0;
        
        //iterate through array using sliding window
        for (int end = 0; end < nums.length; end++) {
            currSum += nums[end];
            
            //check if currSum <= goal, if yes increment totalCount
            //else reduce the currSum by moving start pointer forward
            
            while (start <= end && currSum > goal) {
                currSum -= nums[start++];
            }
            
            //update total count by adding length of current subarray
            totalCount += end - start + 1;
            
        }
        
        return totalCount;
        
    }
    
    public int numSubarraysWithSum(int[] nums, int goal) {
        return slidingWindowAtMost(nums, goal) - slidingWindowAtMost(nums, goal - 1);
    }
}