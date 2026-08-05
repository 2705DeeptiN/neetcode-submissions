class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for (int ele : nums) sum += ele;

        if (sum % 2 != 0)
            return false;
        int targt = sum / 2;
        int[][] dp = new int[n + 1][targt + 1];
        for (int[] r : dp) Arrays.fill(r, -1);

        return solve(0, targt, nums, dp);
    }
    public boolean solve(int i, int targt, int[] nums, int[][] dp) {
        int n = nums.length;
        if (i == n - 1) {
            if (targt == 0)
                return true;
            else
                return false;
        }
        if (dp[i][targt] != -1)
            return dp[i][targt] == 1;
        boolean ans = false;
        boolean skip = solve(i + 1, targt, nums, dp);

        if (targt - nums[i] < 0)
            return skip;
        else {
            boolean pick = solve(i + 1, targt - nums[i], nums, dp);

            ans = pick || skip;
        }

        if(ans) dp[i][targt]=1;
        else dp[i][targt]=0;

        return ans;
    }
}