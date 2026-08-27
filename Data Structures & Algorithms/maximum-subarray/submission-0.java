class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        int currMax = 0;
        int maxSoFar = nums[0];

        for (int num : nums) {
            currMax += num;

            if (currMax > maxSoFar) maxSoFar = currMax;

            if (currMax < 0) currMax = 0;
        }

        return maxSoFar;
    }
}
