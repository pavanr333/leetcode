class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            System.out.println("No solution found");
           return 0;
        }

        int uniqueIndex = 0; // Pointer to keep track of the last unique element's index.

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i]; // Move unique element to the next position.
            }
        }

        return uniqueIndex + 1; // Return the count of unique elements.
    }
}
