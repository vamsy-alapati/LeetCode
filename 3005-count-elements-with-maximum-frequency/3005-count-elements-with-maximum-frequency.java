class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        // create a frequencies array of 100, since 100 is max size of nums.length
        int [] frequencies = new int[100];
        for(int num : nums) {
            frequencies[num-1]++;
        }
        
        //sort the array, find the max frequency at the last index
        Arrays.sort(frequencies);
        int maxFreqIndex = frequencies.length-1;
        
        //initialize total frequency to max freq
        int totalFreq = frequencies[maxFreqIndex];
        
        while(maxFreqIndex > 0 && frequencies[maxFreqIndex] == frequencies[maxFreqIndex-1]) {
            totalFreq += frequencies[maxFreqIndex-1];
            maxFreqIndex--;
        }
        
        return totalFreq;
        
    }
}