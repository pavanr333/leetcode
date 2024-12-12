class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int result= target - nums[i];
            if (hm.containsKey(result)) {
                return new int[]{hm.get(result), i};
            }
            hm.put(nums[i], i);
        }

        return new int[]{}; 
    }
}