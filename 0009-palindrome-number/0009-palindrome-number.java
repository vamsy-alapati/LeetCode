class Solution {
    public boolean isPalindrome(int x) {
        
        if (x < 0 || (x != 0 && x%10 == 0)) {
            return false;
        }
        
        long reverse = 0;
        long temp = x;
        
        //check only half integer reverse is matching with original input integer
        while (reverse < temp) {
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }
        
        return (reverse == temp || reverse/10 == temp);
        
    }
}