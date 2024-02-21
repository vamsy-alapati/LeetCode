class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        
        // trick is in to start from large number and move to small
        while(right>left)
           right = right & right-1;

        return left&right;

    }
}