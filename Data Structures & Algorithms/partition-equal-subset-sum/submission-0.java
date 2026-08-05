class Solution {
    Boolean[][] dp;

    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int ele : nums) sum += ele;

        if (sum % 2 != 0)
            return false;

        int targ = sum / 2;
        dp = new Boolean[nums.length][targ + 1];

        return solve(0, targ, nums);
    }

    public boolean solve(int i, int targ, int[] nums) {
        int n = nums.length;

        if (targ == 0)
            return true;
        if (i == nums.length)
            return false;

        if (dp[i][targ] != null)
            return dp[i][targ];

        boolean skip = solve(i + 1, targ, nums);

        if (nums[i] > targ)
            return dp[i][targ] = skip;
        boolean pick = solve(i + 1, targ - nums[i], nums);

        return dp[i][targ] = skip || pick;
    }
}
