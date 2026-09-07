class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int n = nums.length;
        int[] maxDP = new int[n];
        int[] minDP = new int[n];

        maxDP[0] = nums[0];
        minDP[0] = nums[0];

        int globalMax = nums[0];

        for (int i = 1; i < n; i++) {
            int curr = nums[i];

            maxDP[i] = Math.max(curr, Math.max(maxDP[i - 1] * curr, minDP[i - 1] * curr));
            minDP[i] = Math.min(curr, Math.min(maxDP[i - 1] * curr, minDP[i - 1] * curr));

            globalMax = Math.max(globalMax, maxDP[i]);
        }

        return globalMax;
    }
}
