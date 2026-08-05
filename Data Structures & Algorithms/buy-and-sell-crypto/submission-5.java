class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxx = 0;

        int l = 0;
        for (int r = 0; r < n; r++) {
            if (prices[r] >= prices[l]) {
                int pro = prices[r] - prices[l];
                maxx = Math.max(pro, maxx);
            } else {
                l=r;
            }
        }
        return maxx;
    }
}
