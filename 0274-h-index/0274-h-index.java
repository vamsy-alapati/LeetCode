class Solution {
    public int hIndex(int[] citations) {
        
        //sort the arrays
        Arrays.sort(citations);
        
        int n = citations.length;
        int i;
        
        // increment i from last element of array, if the element is > i,
        // break when element value becomes equal to i
        for(i = 0; i<n; i++) {
            if(citations[n-i-1] <= i) break;
        }
        
        return i;
        
    }
}