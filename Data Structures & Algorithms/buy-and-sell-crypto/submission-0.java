class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int sell = 0;

        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            sell = Math.max(prices[i] - min, sell);
        }

        return sell;
    }
}
