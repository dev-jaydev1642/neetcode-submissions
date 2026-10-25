class Solution {
    public int jump(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return 0;

        int jumps = 0;
        int maxSoFar = 0;
        int currEnd = 0;

        for (int i = 0; i < nums.length; i++) {
            maxSoFar = Math.max(maxSoFar, i + nums[i]);
            if (currEnd == i) {
                jumps++;
                currEnd = maxSoFar;
                if (maxSoFar >= nums.length - 1) break;
            }
        }

        return jumps;
    }
}
