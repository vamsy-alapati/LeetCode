class Solution {
    
    // BRUTE FORCE METHOD
//     public int[] twoSum(int[] nums, int target) {
        
//         for (int i=0; i<nums.length; i++) {
//             for (int j=i+1; j<nums.length; j++) {
//                 if (nums[i]+nums[j] == target) {
//                     return new int[] {i,j};
//                 }
//             }
//         }
//         return null;
        
//     }
    
    
    // Two-Pass Hash Table
    public int[] twoSum(int[] nums, int target) {
        
        //Create a HashMap and insert all elements of array into the map 
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<nums.length; i++) {
            map.put(nums[i], i);
        }
        
        //for each element of array check if it's complement exists in map and return it's index along with array element index
        for (int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) != i) {
                return new int[] {i, map.get(complement)};
            }
        }
        
        return null;
        
    }
}