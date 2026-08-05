class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        dp = new int[n];
        Arrays.fill(dp, -1);

        // get min of last n last bt 1 step
        return Math.min(solve(n - 1, cost), solve(n - 2, cost));
    }

    public int solve(int i, int[] cost) {
        if (i == 0)
            return cost[0];
        if (i == 1)
            return cost[1];
        if (dp[i] != -1)
            return dp[i];

        // do memoisation
        return dp[i]= cost[i] + Math.min(solve(i - 1, cost), solve(i - 2, cost));
    }
}
