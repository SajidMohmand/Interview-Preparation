package Recursion;

public class Q224 {
    public static int calculate(String s) {
        return helper(s, 0)[0];  // Start the recursion from index 0
    }
    private static int[] helper(String s, int index) {
        int n = s.length();
        int sign = 1;  // Current sign (+1 or -1)
        int ans = 0;   // Current result

        while (index < n) {
            char c = s.charAt(index);

            if (Character.isDigit(c)) {
                // Extract the number and update the result
                int num = 0;
                while (index < n && Character.isDigit(s.charAt(index))) {
                    num = num * 10 + s.charAt(index) - '0';
                    index++;
                }
                ans += sign * num;  // Add the number with the current sign
            }
            else if (c == '+') {
                sign = 1;  // Set the sign to positive for the next number
                index++;
            }
            else if (c == '-') {
                sign = -1;  // Set the sign to negative for the next number
                index++;
            }
            else if (c == '(') {
                // Recursively solve the sub-expression inside parentheses
                int[] result = helper(s, index + 1);  // Start from the next index after '('
                ans += sign * result[0];  // Add the result of the sub-expression
                index = result[1];  // Update the index to the position after ')'
            }
            else if (c == ')') {
                return new int[] { ans, index + 1 };  // Return the result and the updated index after ')'
            }
            else {
                index++;  // Skip spaces or other irrelevant characters
            }
        }
        return new int[] { ans, index };  // Return the result and final index after processing the entire string
    }

    public static void main(String[] args) {
        System.out.println(calculate(" 2-1 + 2 "));
    }
}
