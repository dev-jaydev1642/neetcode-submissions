class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> result = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (result.containsKey(complement)) {
                return new int[]{result.get(complement), i};
            }

            result.put(nums[i], i);
        }

        return new int[0];
    }
}
