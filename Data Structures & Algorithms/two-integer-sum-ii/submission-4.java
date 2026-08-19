class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int i = 0, j = num.length - 1;
        // while (i < j) {
        //     if (num[i] + num[j] < target) i++;
        //     else if (num[i] + num[j] > target) j--;
        //     else if (num[i] + num[j] == target) return new int[]{i + 1, j + 1};
        // }
        // return new int[0];

        int i = 0, j = nums.length - 1;

        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum < target) i++;
            else if (sum > target) j--;
            else return new int[]{i + 1, j + 1};
        }

        return new int[0];
    }
}
