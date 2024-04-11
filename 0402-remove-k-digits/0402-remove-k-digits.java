class Solution {
    public String removeKdigits(String num, int k) {
        
        //initialize a stack
        Stack<Character> stack = new Stack<>();
        
        //loop through the digits of number
        for (char digit : num.toCharArray()) {
            
            //when stack not empty, k > 0
            // and the current digit is < the top digit in stack
            // pop the top element in stack
            // and decrement k
            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                stack.pop();
                k--;
            }
            
            //add current digit to stack
            stack.push(digit);
        }
        
        // Remove remaining k digits from the end of the stack
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }
        
        
        // Construct the resulting string from the stack
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse(); // Reverse to get the correct order
        
        
        // Remove leading zeros
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        
        
        return sb.length() > 0 ? sb.toString() : "0";
        
    }
}