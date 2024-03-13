class Solution {
    public int pivotInteger(int n) {
        
        //two pointer
        int leftVal = 1;
        int rightVal = n;
        
        //edge cases
        if(n==1) return n;
        
        //initialize leftSum and rightSum
        int leftSum = leftVal;
        int rightSum = rightVal;
        
        while(leftVal < rightVal) {
            if(leftSum < rightSum) {
                leftVal++;
                leftSum += leftVal;
            }
            else {
                rightVal--;
                rightSum += rightVal;
            }
            
            if(leftSum == rightSum && leftVal + 1 == rightVal - 1) {
                return leftVal+1;
            }
        }
        
        return -1;
    }
}