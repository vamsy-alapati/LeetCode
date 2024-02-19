class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        StringBuilder str = new StringBuilder();
        str.append(s);
        
        return s.compareTo(str.reverse().toString()) == 0;
        
    }
}