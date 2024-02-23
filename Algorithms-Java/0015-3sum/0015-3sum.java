class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Two Pointer approach
        
        //create a new list to store the triplets
        List<List<Integer>> result = new ArrayList<>();
        
        //edge case - if length of nums < 3 then return empty result
        if(nums.length < 3) {
            return result;
        }
        
        //sort the array
        Arrays.sort(nums);
        
        // start the loop
        for (int i=0; i<nums.length; ++i) {
            //if the nums[i] > 0, then no triplet possible from here -> break the loop
            if(nums[i] > 0) {
                break;
            }
            
            //move i to last occurance of duplicate nums to avoid duplicate triplets
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;   // move to next i in loop
            }
            
            // set low to the next number and high to last number after this index
            int low = i+1;
            int high = nums.length-1;
            
            while (low < high) {
                // summ all the nums at i, low, high
                int sum = nums[i]+nums[low]+nums[high];

                if (sum > 0) {
                    high--;
                }
                else if (sum < 0) {
                    low++;
                }
                else {
                    // add triplet to result list
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));

                    int lastLowOccurance = nums[low];
                    int lastHighOccurance = nums[high];

                    //check for duplicates of low and move low to the last occurance of low
                    while (low<high && nums[low] == lastLowOccurance) {
                        low++;
                    }

                    //check for duplicates of high and move high to the last occurance of low
                    while (low<high && nums[high] == lastHighOccurance) {
                        high--;
                    }
                }
            }
            
        }
        
        return result;
    }
}