class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Start from the last digit and handle the carry
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits; // No carry, return the result
            }
            digits[i] = 0; // Set the current digit to 0 and carry over
        }

        // If all digits were 9, we need an extra digit
        int[] result = new int[n + 1];
        result[0] = 1; // Set the first digit to 1, all other digits are 0 by default
        return result;
    }
}
