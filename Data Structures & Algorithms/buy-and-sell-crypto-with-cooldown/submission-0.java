class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n <= 1) return 0;
        int[][] dp = new int[n+2][2];

        dp[0][0] = 0; 
        dp[1][0] = 0;
        dp[0][1] = Integer.MIN_VALUE; 
        dp[1][1] = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int dpIdx = i + 2;
            dp[dpIdx][0] = Math.max(dp[dpIdx - 1][0], dp[dpIdx - 1][1] + prices[i]);
            dp[dpIdx][1] = Math.max(dp[dpIdx - 1][1], dp[dpIdx - 2][0] - prices[i]);
        }

        return dp[n + 1][0];
    }
}
