class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;
        
        int sumAll = (n*(n+1))/2;
        
        int accum = Arrays.stream(nums).sum();
        return sumAll - accum;
        
    }
}