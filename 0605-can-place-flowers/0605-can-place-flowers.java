class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int count = 0;
        int l = flowerbed.length;
        
        // edge cases
        if(n == 0) return true;
        
        if(l == 1) return flowerbed[0] == 0;
        
        
        
        //first element
        if(flowerbed[0] == 0 && flowerbed[1] == 0) {
            n--;
            flowerbed[0] = 1;
        }
        
        //from second element to last but one element
        for (int i = 1; i < l-1; i++) {
            if(flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                n--;
                flowerbed[i] = 1;
            }
        }
        
        //last element
        if(flowerbed[l-1] == 0 && flowerbed[l-2] == 0) {
            n--;
            flowerbed[l-1] = 0;
        }
        
        return n<=0;
        
    }
}