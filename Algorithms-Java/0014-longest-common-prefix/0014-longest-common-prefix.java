class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        StringBuilder result = new StringBuilder();
        
        Arrays.sort(strs);
        for (String s : strs) {
            System.out.println(s);
        }
        
        String first = strs[0];
        String last = strs[strs.length - 1];
        
        int minLength = Math.min(first.length(), last.length());
        
        for (int i=0; i<minLength; i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return result.toString();
            }
            else {
                result = result.append(first.charAt(i));
            }
            
        }
        
        return result.toString();
        
    }
}