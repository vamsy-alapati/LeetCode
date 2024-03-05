class Solution {
    public int minimumLength(String s) {
        
        //intializing two pointers at start and end
        int start = 0;
        int end = s.length() - 1;
        
        char [] chars = s.toCharArray();
        
        // start the two pointers and see if they are equal
        while (start < end && chars[start] == chars[end]) {
            
            // placeholder to check for the same character
            char c = chars[start];
            
            // increment the start index if the next char is same
            while (start <= end && c == chars[start]) {
                start++;
            }
            
            // decrement the end index if the previous char is same
            while (start < end && c == chars[end]) {
                end--;
            }
            
        }
        
        //return the length of the remaining string
        return end-start+1;
        
    }
}