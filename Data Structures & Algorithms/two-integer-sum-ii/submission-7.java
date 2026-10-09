class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int n = numbers.length;
        int l = 0;
        int r = n - 1;

        for(int i = 0; i<n; i++) {
            if(numbers[l] + numbers[r] < target) {
                l++;
            }
            else if (numbers[l] + numbers[r] > target) {
                r--;
            }
            else{
                return new int[] {l + 1, r + 1};
            }
        }

        return new int[0];
        
    }
}
