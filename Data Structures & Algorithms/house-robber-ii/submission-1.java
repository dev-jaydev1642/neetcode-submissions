class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        int max1 = robIgnoreHouse(nums, 0, nums.length - 2);
        int max2 = robIgnoreHouse(nums, 1, nums.length - 1);

        return Math.max(max1, max2);
    }

    private int robIgnoreHouse(int[] nums, int start, int end) {
        int totalHouse = end - start + 1;

        int[] dp = new int[totalHouse];

        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start + 1]);

        for (int i = 2; i < totalHouse; i++) {
            dp[i] = Math.max(dp[i - 1], nums[start + i] + dp[i - 2]);
        }

        return dp[totalHouse - 1];
    }
}
   