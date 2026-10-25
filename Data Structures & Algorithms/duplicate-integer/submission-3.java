class Solution {
    public boolean hasDuplicate(int[] nums) {
       if (nums.length == 0 || nums == null) return false;

       Arrays.sort(nums);

       for (int i = 0; i < nums.length - 1; i++) if (nums[i] == nums[i + 1]) return true;

       return false;
    }
}