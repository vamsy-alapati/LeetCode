import java.util.*;

class Solution {
    
    private List<List<Integer>> result;
    
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        return new AbstractList<List<Integer>>() {
            
            public List<Integer> get(int index) {
                init();
                return result.get(index);
            }
            
            public int size() {
                init();
                return result.size();
            }
            
            private void init() {
                
                if(result != null) return;
                
                List<List<Integer>> res = new ArrayList<>();
                Set<List<Integer>> resSet = new HashSet<>();
                
                int n = nums.length;
                
                //sort the array
                Arrays.sort(nums);
                
                for(int i = 0; i < n -3; i++) {
                    
                    for(int j = i+1; j < n-2; j++) {
                        
                        long newTarget = (long) target - (long) nums[i] - (long) nums[j];
                        int left = j+1;
                        int right = n-1;
                        
                        while(left < right) {
                            long total = (long) nums[left] + (long) nums[right];
                            if(total == newTarget) {
                                resSet.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                                left++;
                                right--;
                                //avoid duplicate starting points
                                while(left < right && nums[left] == nums[left-1]){
                                    left++;
                                }
                                while(left < right && nums[right] == nums[right+1]) {
                                    right--;
                                }
                            }
                            else if(total < newTarget) {
                                left++;
                            }
                            else {
                                right--;
                            }
                        }
                        
                    }
                    
                }
                
                res.addAll(resSet);
                result = res;
                
            }
            
        };
    }
}