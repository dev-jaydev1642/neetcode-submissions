class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int min = prices[0];
        int sell = 0;

        for (int i = 1; i < prices.length; i++) {
            min = Math.min(prices[i], min);
            sell = Math.max(prices[i] - min, sell);
        }

        return sell;
    }
}
