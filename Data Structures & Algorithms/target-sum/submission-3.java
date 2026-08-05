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
    public int solve(int i, int[] nums, int p) {

        if(i==nums.length){
            return p==0?1:0;
        }
        if(dp[i][p]!=-1) return dp[i][p];

        int skip=solve(i+1,nums,p);
        int tk=0;

        if(nums[i]<=p){
            tk=solve(i+1,nums,p-nums[i]);
        }

        return dp[i][p]=tk+skip;
    }
}