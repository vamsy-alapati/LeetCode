class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum = 0;

        for (int n : nums) {
            sum += n;
        }

        int len = nums.length;
        for (int i=len-1; i>=2; i--) {
            sum -= nums[i];
            if(sum > nums[i]) {
                return sum+nums[i];
            }
        }
        return -1;
    }
}