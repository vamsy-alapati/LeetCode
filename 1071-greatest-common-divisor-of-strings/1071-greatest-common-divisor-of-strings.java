

//Brute Force Approach
// class Solution {
    
//     public boolean valid(String str1, String str2, int k) {
//         int len1 = str1.length();
//         int len2 = str2.length();
        
//         if(len1 % k > 0 || len2 % k > 0) {
//             return false;
//         }
//         else {
//             String base = str1.substring(0,k);
//             return str1.replace(base,"").isEmpty() && str2.replace(base,"").isEmpty();
//         }
//     }
    
//     public String gcdOfStrings(String str1, String str2) {
//         int len1 = str1.length();
//         int len2 = str2.length();
        
//         for(int i = Math.min(len1,len2); i >= 1; i--) {
//             if(valid(str1, str2, i)) {
//                 return str1.substring(0,i);
//             }
//         }
        
//         return "";
//     }
// }


//tougher logic, GCD of lengths of str1 and str2 will be the length of gcdbase

class Solution {
    public int gcd(int x, int y) {
        if(y == 0) {
            return x;
        }
        else {
            return gcd(y, x % y);
        }
    }
    
    public String gcdOfStrings(String str1, String str2) {
        //if both strings are multiples of same gcd, sum of those two in any order should be same
        if(!(str1+str2).equals(str2+str1)) { // if not equal, then false, since not made of same gdcbase
            return "";
        }
        
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }
}