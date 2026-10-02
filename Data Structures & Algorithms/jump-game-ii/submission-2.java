class Solution {
    public int jump(int[] nums) {
        if (nums.length <= 1) return 0;

        int currEnd = 0;
        int maxSoFar = 0;
        int jumps = 0;

        for (int i = 0; i < nums.length; i++) {
            maxSoFar = Math.max(maxSoFar, i + nums[i]);
            if (i == currEnd) {
                jumps++;
                currEnd = maxSoFar;
                if (currEnd >= nums.length - 1) break;
            }
        }

        return jumps;
    }
}
