class Solution {
    public int romanToInt(String s) {
        
        //Store the romans and values in HashMap
        Map<Character, Integer> romans = new HashMap<>();
        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);
        
        int num = 0;
        int len = s.length();
        
        for (int i = 0; i < len; i++) {
            int cur = romans.get(s.charAt(i));
            if (i < len - 1 && cur < romans.get(s.charAt(i + 1))) {
                num -= cur;
            } else {
                num += cur;
            }
        }
        
        return num;
    }
}