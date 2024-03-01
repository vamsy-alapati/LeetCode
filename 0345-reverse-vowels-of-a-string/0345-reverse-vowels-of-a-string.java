class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();

        int start = 0;
        int end = s.length() - 1;
        String vowels = "aeiouAEOIU";

        while (start < end) {
            //increment the start index until it finds a vowel
            while (start < end && vowels.indexOf(chars[start]) == -1) {
                start++;
            }

            //decrement the end index until it finds a vowel
            while(start < end && vowels.indexOf(chars[end]) == -1) {
                end--;
            }

            //swap the vowels
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            //increment the start and decrement the end indices
            start++;
            end--;

        }

        return new String(chars);
    }
}