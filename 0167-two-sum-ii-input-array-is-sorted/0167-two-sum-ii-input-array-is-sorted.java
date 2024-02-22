class Solution {
    public int[] twoSum(int[] numbers, int target) {
        

        // can be achieved with this logic as well, but since it is sorted
        // too many elements would result in time limit exceeded
        // hence, consider second method using first and last elements
        // for (int i=0; i<numbers.length-1; i++) {
        //     for (int j=i+1; j<numbers.length; j++) {
        //         System.out.println(numbers[i]+", "+numbers[j]);
        //         if(numbers[i] + numbers[j] == target) {
        //             return new int[] {i+1, j+1};
        //         }
        //     }
        // }

        int left = 0;
        int right = numbers.length-1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if(sum == target) {
                return new int[] {left+1, right+1};
            }
            else if (sum > target) {
                right--;    //shift the right pointer to previous number
            }
            else {
                left++;     //shift left pointer to next number
            }
        }

        return null;

    }
}