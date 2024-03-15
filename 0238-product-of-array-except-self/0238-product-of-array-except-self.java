class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        
        //initialize answers array and fill with zeros
        int [] ans = new int[n];
        Arrays.fill(ans, 0);
        
        int zeros = 0;
        int product = 1;
        
        //loop through nums and count zeros and product of non-zero elements
        for (int k : nums) {
            if(k == 0) {
                zeros++;
                continue;
            }
            product *= k;
        }
        
        //if zeros is one, then except for the zero element all elements product = 0
        if(zeros == 1) {
            for (int i=0; i<n; i++) {
                ans[i] = nums[i] == 0 ? product : 0;
            }
        }
        //if zeroes zeros are 0, then product ans of each element is product/that number
        else if(zeros == 0) {
            for(int i = 0; i<n; i++) {
                ans[i] = product/nums[i];
            }
        }
        
        
        //if the zeros are more than 1 (2 or more) then product ans of all elements is 0
        //so return ans without changing anything
        return ans;
        
    }
}