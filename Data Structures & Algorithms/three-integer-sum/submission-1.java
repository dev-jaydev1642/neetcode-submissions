class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    //     Arrays.sort(nums);
    //     int n = nums.length;
    //     List<List<Integer>> result = new ArrayList<>();

    //     for (int i = 0; i < n - 2; i++) {
    //         if (i > 0 && nums[i] == nums[i - 1]) 
    //             continue;

    //         int j = i + 1, k = n - 1;

    //         while (j < k) {
    //             int target = nums[i] + nums[j] + nums[k];

    //             if (target == 0) {
    //                 List<Integer> subRes = new ArrayList<>();
    //                 subRes.add(nums[i]);
    //                 subRes.add(nums[j]);
    //                 subRes.add(nums[k]);
    //                 result.add(subRes);

    //                 j++;
    //                 k--;

    //                 while (j < k && nums[j] == nums[j - 1]) 
    //                     j++;

    //                 while (j < k && nums[k] == nums[k + 1])
    //                     k--;
    //             } else if (target < 0) {
    //                 j++;
    //             } else {
    //                 k--;
    //             }                
    //         }
    //     } 
    //     return result;
    // }

        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1, k = n - 1;

            while (j < k) {
                int target = nums[i] + nums[j] + nums[k];

                if (target == 0) {
                    List<Integer> subres = new ArrayList<>();
                    subres.add(nums[i]);
                    subres.add(nums[j]);
                    subres.add(nums[k]);

                    result.add(subres);

                    j++;
                    k--;

                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;

                } else if (target < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return result;
    }
}
