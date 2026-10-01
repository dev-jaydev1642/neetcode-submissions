class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1;

        for (int i = 0; i < n; i++) {
            if (nums[left] + nums[right] < target) left++;
            else if (nums[left] + nums[right] > target) right--;
            else return new int[]{left + 1, right + 1}; 
        }

        return new int[0];
    }
}
