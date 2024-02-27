import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int maxCandies = Integer.MIN_VALUE;

        for (int i=0; i<candies.length; i++) {
            if(candies[i] > maxCandies) {
                maxCandies = candies[i];
            }
        }

        List<Boolean> result = new ArrayList<>();
        for(int i=0; i<candies.length; i++) {
            result.add(candies[i]+extraCandies >= maxCandies);
        }

        return result;
    }
}