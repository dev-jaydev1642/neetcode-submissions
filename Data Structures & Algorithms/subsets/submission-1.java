class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> currList, int[] nums, int start) {
        result.add(new ArrayList<>(currList));

        for (int i = start; i < nums.length; i++) {
            currList.add(nums[i]);
            backtrack(result, currList, nums, i + 1);
            currList.remove(currList.size() - 1);
        }
    }
}
