class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n>0) && (n & (n-1)) == 0;  
        // bit wise operation any 2 power and minus 1 is always 0
        // example 4 -> 100 but 3 -> 011
        // 8 -> 1000 && 7 -> 0111
    }
}