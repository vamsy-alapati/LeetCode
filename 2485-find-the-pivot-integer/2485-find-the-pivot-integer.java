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
        
        //start the loop 
        while(leftVal < rightVal) {
            //if leftSum < rightSum -> increment the leftVal and add it to leftSum
            if(leftSum < rightSum) {
                leftVal++;
                leftSum += leftVal;
            }
            //if leftSum > rightSum -> decrement the rightVal and add it to rightSum
            else {
                rightVal--;
                rightSum += rightVal;
            }
            
            //check if leftSum = rightSum and pointers are next to each other
            if(leftSum == rightSum && leftVal + 1 == rightVal - 1) {
                return leftVal+1;
            }
        }
        
        return -1;
    }
}