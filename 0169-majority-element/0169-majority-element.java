class Solution {
    public int majorityElement(int[] nums) {
        
        // if an element occurs more than n/2 times, after sorting the array, 
        // the element at index n/2 should be that same
        int n = nums.length;
        
        Arrays.sort(nums);
        
        return nums[n/2];
        
    }
}