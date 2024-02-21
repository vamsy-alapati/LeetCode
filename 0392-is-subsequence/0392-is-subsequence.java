class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        // loop through t using j incrementing every time in while loop
        // increment i only if there is a match since it is ordered
        while(i < s.length() && j < t.length()) {
            if(s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        } 

        // ans is true only if all elements of s are matched with elements in t
        // hence i (match count) should be == s.length (all elements)
        return i == s.length();
    }



}