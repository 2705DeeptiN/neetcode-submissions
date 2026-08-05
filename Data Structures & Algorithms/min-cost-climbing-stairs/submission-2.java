class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        int[] dp = new int[n];
        // size n coz v r nt storing top element

        dp[0] = cost[0];
        dp[1] = cost[1];

        // we need current step + min of wt is thr to reach tht step
        for (int i = 2; i < n; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 2], dp[i - 1]);
        }

        // now can b on last or last second step and can reach from both so v need their min
        return Math.min(dp[n - 1], dp[n - 2]);
    }
}
