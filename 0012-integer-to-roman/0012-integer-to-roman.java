class Solution {
    public String intToRoman(int num) {

        // Long method

        StringBuilder roman = new StringBuilder();

        while(num > 0) {
            if(num < 5) {
                if(num == 4) {
                    roman.append("IV");
                    num -= 4;
                }
                else {
                    roman.append("I");
                    num--;
                }
            }
            else if(num < 10) {
                if(num == 9) {
                    roman.append("IX");
                    num -= 9;
                }
                else {
                    roman.append("V");
                    num -= 5;
                }
            }
            else if(num < 50) {
                if(num >= 40) {
                    roman.append("XL");
                    num -= 40;
                }
                else {
                    roman.append("X");
                    num -= 10;
                }
            }
            else if(num < 100) {
                if(num >= 90) {
                    roman.append("XC");
                    num -= 90;
                }
                else {
                    roman.append("L");
                    num -= 50;
                }
            }
            else if(num < 500) {
                if(num >= 400) {
                    roman.append("CD");
                    num -= 400;
                }
                else {
                    roman.append("C");
                    num -= 100;
                }
            }
            else if(num < 1000) {
                if(num >= 900) {
                    roman.append("CM");
                    num -= 900;
                }
                else {
                    roman.append("D");
                    num -= 500;
                }
            }
            else {
                roman.append("M");
                num -= 1000;
            }
        }

        return roman.toString();

    }
}