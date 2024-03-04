class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        
        // sort the array
        Arrays.sort(tokens);
        
        // declare two pointers and score
        int left = 0;
        int right = tokens.length-1;
        
        int score = 0;
        
        // two pointer approach
        while(left <= right) {
            if(power >= tokens[left]) {
                power -= tokens[left];
                score++;
                left++;
            }
            else if (left < right && score > 0) {
                score -= 1;
                power += tokens[right];
                right--;
            }
            else {
                return score;
            }
        }
        
        return score;
        
    }
}