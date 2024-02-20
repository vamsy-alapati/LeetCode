class Solution {
    public int removeDuplicates(int[] nums) {
        
        // start at 0
        int i = 0;
        
        // loop through array
        for (int n : nums) {
            
            // if i < 2 --> first 2 elements can be directly copied
            // or if the current element doesn't match with 2nd element before it,
            // then it be copied and incremented else just proceed with loop until 
            // a different number occurs
            if(i < 2 || n != nums[i-2]) {
                nums[i] = n;
                i++;
            }
        }
        
        return i;
        
    }
}