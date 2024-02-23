class Solution {
    public int findJudge(int n, int[][] trust) {

        // initialize an array with the length of people in town
        int [] trustCount = new int [n];

        // if a person trusts someone, decrement the trustCount of that index in array
        // if a person is being trusted, increment the trustCount of that index
        // [a, b] -> a is trusting someone, b is being trusted
        for (int[] pair : trust) {
            trustCount[pair[0]-1]--;
            trustCount[pair[1]-1]++;
        }

        // if a town judge exists, he is trusted by all -> trustCount = n-1
        for (int i=0; i < n; i++) {
            if(trustCount[i] == n-1) {
                return i+1;
            } 
        }

        return -1;

    }
}