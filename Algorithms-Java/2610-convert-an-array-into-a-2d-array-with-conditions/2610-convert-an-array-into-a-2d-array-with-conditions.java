class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int freq[] = new int [nums.length + 1];
        // System.out.println(freq.length);
        
        ArrayList<List<Integer>> ans = new ArrayList<>();
        for (int c : nums) {
            System.out.println("freq[c]: " + freq[c]);
            System.out.println("ans size: " + ans.size());
            if (freq[c] >= ans.size()) {
                ans.add(new ArrayList<>());
            }
            
            // add the element to the ans array and then increment the freq of the element
            ans.get(freq[c]).add(c);
            freq[c]++;
        }
        return ans;
    }
}