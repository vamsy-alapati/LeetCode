import java.util.Arrays;

class Solution {
    public String maximumOddBinaryNumber(String s) {
        int countOnes = 0;
        StringBuilder res = new StringBuilder();

        for(char ch : s.toCharArray()) {
            if(ch == '1') {
                countOnes++;
            }
        }

        // append 1 first until countOnes > 1, means until one 1 is remaining in count
        // then append zero's until one char length less than length of binary string
        for (int i=0; i < s.length() - 1; i++) {
            if(countOnes > 1) {
                countOnes--;
                res.append('1');
            }
            else {
                res.append('0');
            }
        }

        // append 1 at the last of string at the last char to make it odd number.
        res.append('1');
        return res.toString();
    }
}
