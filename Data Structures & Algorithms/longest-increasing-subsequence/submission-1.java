class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[nums.length][nums.length + 1];
        for (int[] r : dp) Arrays.fill(r, -1);
        return solve(0, -1, nums,dp);
    }
    public int solve(int cur, int prev, int[] nums,int[][]dp) {
        if (cur == nums.length)
            return 0;

        if (dp[cur][prev+1] != -1)
            return dp[cur][prev+1];

        int skip = solve(cur + 1, prev, nums,dp);
        int tk = 0;
        if (prev == -1 || nums[cur] > nums[prev]) {
            tk = 1 + solve(cur + 1, cur, nums,dp);
        }
        return dp[cur][prev+1]=Math.max(tk, skip);
    }
}
