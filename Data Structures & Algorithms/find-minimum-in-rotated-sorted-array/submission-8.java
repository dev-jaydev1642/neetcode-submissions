class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2 && nums[0] < nums[1]) return nums[0];

        int l = 0, h = nums.length - 1;
        int min = 0;

        if (nums[l] < nums[h]) return nums[l];

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (mid - 1 >= 0 && nums[mid - 1] > nums[mid]) {
                min = nums[mid];
                break;
            }
            else if (nums[mid] < nums[h]) h = mid - 1;
            else l = mid + 1;
        }

        return min;
    }
}
