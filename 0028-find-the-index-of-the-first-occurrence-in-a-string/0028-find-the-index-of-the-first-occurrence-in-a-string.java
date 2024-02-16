class Solution {
    public int strStr(String haystack, String needle) {

        // return haystack.indexOf(needle); ---> this would solve the question

        int len = haystack.length();   //length of haystack (bigger string)
        int subStrLen = needle.length();     //length of substring to be searched for


        for (int i=0; i<=len-subStrLen; i++) {
            if(haystack.substring(i, i+subStrLen).equals(needle)) {   // check if the substring of bigger string of length of needle is matching with needle
                return i;       // if matching return the starting index of the substring in the big string
            }
        }
        return -1;
    }
}