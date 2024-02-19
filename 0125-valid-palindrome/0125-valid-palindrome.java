class Solution {
    public boolean isPalindrome(String s) {
        
        // Convert to lowercase and remove all non-alphanumeric characters
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        // placeholder to c= hold the reverse str in StringBuilder
        StringBuilder str = new StringBuilder();
        str.append(s);
        
        return s.compareTo(str.reverse().toString()) == 0;
        
    }
}