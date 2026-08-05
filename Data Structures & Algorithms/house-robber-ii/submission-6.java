class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1)
    return nums[0];
        return Math.max(solve(0, n - 2, nums), solve(1, n - 1, nums));
    }
    public int solve(int i, int j, int[] nums) {
        if (i == j)
            return nums[i];
        int l = j - i + 1;
        int[] dp = new int[l];

        dp[0] = nums[i];
        dp[1] = Math.max(nums[i], nums[i + 1]);
        // here similar to n-1 or length of subarray v r calculating on

        for (int x = 2; x < l; x++) {
            int take = nums[x + i] + dp[x - 2];
            int skip = dp[x - 1];

            dp[x] = Math.max(take, skip);
        }
        return dp[l - 1];
    }
}
