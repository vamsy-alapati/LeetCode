class Solution {
    public String customSortString(String order, String s) {
        
        int N = s.length();
        //create a Character array and load all characters of S into this
        Character [] chars = new Character[N];
        for (int i = 0; i < N; i++) {
            chars[i] = s.charAt(i);
        }
        
        //define custom comparator
        Arrays.sort(chars, (c1, c2) -> {
            //if the index of char c in order is < the index of e in b, 
            //then c should be first than e
            return order.indexOf(c1)-order.indexOf(c2);
        });
        
        //return result
        StringBuilder result = new StringBuilder();
        for (Character c : chars) {
            result.append(c);
        }
        
        return result.toString();
    }
}