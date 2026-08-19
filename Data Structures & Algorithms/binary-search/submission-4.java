class Solution {
    public int search(int[] nums, int target) {
        // if (nums.length == 1 && nums[0] == target) return 0;

        int l = 0, r = nums.length - 1; 

        while (l <= r) {
            int m = l + (r - l)/2;

            if (nums[m] == target) {
                return m;
            } else if (nums[m] < target) {
                l++;
            } else {
                r--;
            }
        }

        return -1;
    }
}
