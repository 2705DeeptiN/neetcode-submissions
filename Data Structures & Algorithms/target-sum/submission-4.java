class Solution {
    int[][] dp;
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int ele : nums) sum += ele;

        if (Math.abs(target) > sum)
            return 0;

        if ((target + sum) % 2 != 0)
            return 0;

        int p = (sum + target) / 2;

        dp = new int[nums.length][p + 1];

        for (int[] r : dp) Arrays.fill(r, -1);

        // idx,nums,p

        return solve(0, nums, p);
    }
    public int solve(int i, int[] nums, int rem) {

        if(i==nums.length){
            return rem==0?1:0;
        }
        if(dp[i][rem]!=-1) return dp[i][rem];

        int skip=solve(i+1,nums,rem);
        int tk=0;

        if(nums[i]<=rem){
            tk=solve(i+1,nums,rem-nums[i]);
        }

        return dp[i][rem]=tk+skip;
    }
}