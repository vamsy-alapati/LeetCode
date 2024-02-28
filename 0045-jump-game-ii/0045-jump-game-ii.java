class Solution {
    public int jump(int[] nums) {
        
        int targetIndex = nums.length-1;
        
        int end = 0;
        int farthest = 0;
        int count = 0;
        
        for(int i =0; i<nums.length-1; i++) {
            farthest = Math.max(farthest, i+nums[i]);
            if(farthest >= targetIndex) {
                ++count;
                break;
            }
            if(i == end) {
                ++count;
                end = farthest;
            }
        }
        
        return count;
        
    }
}