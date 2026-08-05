class Solution {
    int[][] dp;

    public int coinChange(int[] coins, int amnt) {
        int n = coins.length;

        dp = new int[n][amnt + 1];

        for (int[] r : dp) {
            Arrays.fill(r, -1);
        }
        int ans = count(0, coins, amnt);

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    public int count(int i, int[] coins, int amnt) {
        if (amnt == 0)
            return 0;

        if (i == coins.length)
            return Integer.MAX_VALUE;

        if (dp[i][amnt] != -1)
            return dp[i][amnt];

        int skip = count(i + 1, coins, amnt);

        int pick = Integer.MAX_VALUE;
        
        if (coins[i] <= amnt) {
            int res = count(i, coins, amnt - coins[i]);

            if (res != Integer.MAX_VALUE)
                pick = 1 + res;
        }
        return dp[i][amnt] = Math.min(pick, skip);
    }
}
