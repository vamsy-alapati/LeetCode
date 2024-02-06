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
//     public int[] twoSum(int[] nums, int target) {
        
//         //Create a HashMap and insert all elements of array into the map 
//         Map<Integer, Integer> map = new HashMap<>();
//         for (int i = 0; i<nums.length; i++) {
//             map.put(nums[i], i);
//         }
        
//         //for each element of array check if it's complement exists in map and return it's index along with array element index
//         for (int i=0; i<nums.length; i++) {
//             int complement = target - nums[i];
//             if(map.containsKey(complement) && map.get(complement) != i) {
//                 return new int[] {i, map.get(complement)};
//             }
//         }
        
//         return null;
        
//     }
    
    
    //One-Pass Hash Table
//     public int[] twoSum(int[] nums, int target) {
        
//         Map<Integer, Integer> map = new HashMap<>();
//         for (int i=0; i<nums.length; i++) {
//             int complement = target - nums[i];
            
//             //if we find the complement then we stop inserting into map and return
//             // since we insert first and only then we find the complement, we reverse the order of returning the array to get correct output.
//             if (map.containsKey(complement)) {
//                 return new int[] { map.get(complement), i};
//             }
            
//             map.put(nums[i],i);  // inserting element of array into map until we find the complement.
            
//         }
//         return null;
//     }
    
    public int[] twoSum(int[] nums, int target) {
        
        List<Integer> list = new ArrayList<>();
        
        for (int i=0; i<nums.length; i++) {
            int complement = target-nums[i];
            
            if(list.contains(complement)) {
                return new int[] {list.indexOf(complement), i};
            }
            
            list.add(nums[i]);
        }
        return null;
        
    }
}