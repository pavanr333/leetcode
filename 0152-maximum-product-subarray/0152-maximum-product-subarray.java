class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxProduct = nums[0]; // The result
        int maxSoFar = nums[0];   // Maximum product including the current number
        int minSoFar = nums[0];   // Minimum product including the current number

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            // Swap maxSoFar and minSoFar if the current number is negative
            if (current < 0) {
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            // Update maxSoFar and minSoFar
            maxSoFar = Math.max(current, maxSoFar * current);
            minSoFar = Math.min(current, minSoFar * current);

            // Update the result
            maxProduct = Math.max(maxProduct, maxSoFar);
        }

        return maxProduct;
    }
}
