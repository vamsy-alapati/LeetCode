class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        Arrays.sort(nums);
        
        List<List<Integer>> res = new ArrayList<>();
        
        for (int a = 0; a < nums.length - 3; a++) {
            // skip the duplicate starting values
            if(a > 0 && nums[a] == nums[a-1]){
                continue;
            }
            
            for(int b = a+1; b < nums.length - 2; b++) {
                //skip duplicate starting values
                if(b > a+1 && nums[b] == nums[b-1]){
                    continue;
                }
                
                int c = b + 1;
                int d = nums.length-1;
                
                while(c < d) {
                    long total =(long) nums[a]+nums[b]+nums[c]+nums[d];
                    // System.out.println("a: "+a+" :: nums[a]: "+nums[a]);
                    // System.out.println("b: "+b+" :: nums[b]: "+nums[b]);
                    // System.out.println("c: "+c+" :: nums[c]: "+nums[c]);
                    // System.out.println("d: "+d+" :: nums[d]: "+nums[d]);
                    // System.out.println("Total: "+total);
                    // System.out.println("Target: "+target);
                    if(total == target) {
                        System.out.println("match found");
                        res.add(Arrays.asList(nums[a],nums[b],nums[c],nums[d]));
                        c++;
                        d--;
                        
                        //skip duplicates
                        while (c < d && nums[c] == nums[c-1]){
                            c++;
                        }
                        while(c < d && nums[d] == nums[d+1]){
                            d--;
                        }
                        
                    }
                    else if(total < target) {
                        c++;
                    }
                    else {
                        d--;
                    }
                }
                
            }
        }
        
        return res;
        
    }
}