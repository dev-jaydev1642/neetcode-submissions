class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return -1;

        int currMax = 0;
        int maxSoFar = nums[0];

        for (int i = 0; i < nums.length; i++) {
            currMax = Math.max(nums[i], nums[i] + currMax);
            maxSoFar = Math.max(currMax, maxSoFar);
        }

        return maxSoFar;
    }
}
