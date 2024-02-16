class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        
        Map <Integer, Integer> map = new HashMap<>();

        // Insert all the unique elements into Map and update their frequencies
        for (int i = 0; i<arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else {  //insert into the map
                map.put(arr[i], 1);
            }
        }

        // Get all the frequency values of unique elements into ArrayList
        List<Integer> freqs = new ArrayList();

        
        for (int n : map.values()) {
            freqs.add(n);
        }

        // Sort the frequencies in ascending order
        Collections.sort(freqs);

        int count = 0; // This will be output

        // traverse through each element
        for (int i=0; i<freqs.size(); i++) {

            int currFreq = freqs.get(i);
            // if k > current element frequency then
            // update the k = k - curr element frequency
            // and set current frequency to 0
            if (k > currFreq) {  
                k -= currFreq;
                freqs.set(i, 0);
            }
            // if k <= curr element freq, then update curr element freq = curr freq - k
            // and set k = 0
            else {
                freqs.set(i, currFreq-k);
                k = 0;
            }

            // if the current element freq = 0, then it has been removed, 
            // non-zero value means it is present hence increase count
            if (freqs.get(i) != 0) count++;
        }

        return count;

    }
}