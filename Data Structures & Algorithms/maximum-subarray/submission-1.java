class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int currMax = 0;
        int maxSoFar = nums[0];

        for (int num : nums) {
            currMax = Math.max(num, currMax + num);
            maxSoFar = Math.max(maxSoFar, currMax);
        }

        return maxSoFar;
    }
}
