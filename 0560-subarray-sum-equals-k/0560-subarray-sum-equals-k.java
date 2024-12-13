import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int currentSum = 0;
        int count = 0;
        
        // Initialize the hashmap with the base case
        hm.put(0, 1); // This handles the case where the subarray starts from index 0
        
        for (int i = 0; i < n; i++) {
            currentSum += nums[i]; // Update the running sum
            
            // Check if (currentSum - k) exists in the hashmap
            if (hm.containsKey(currentSum - k)) {
                count += hm.get(currentSum - k); // Add the frequency of (currentSum - k)
            }
            
            // Update the frequency of the current sum in the hashmap
            hm.put(currentSum, hm.getOrDefault(currentSum, 0) + 1);
        }
        
        return count; // Return the total count of subarrays
    }
}
