class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1)
            return nums[0];

        return Math.max(robRange(nums, 0, n - 2),
                        robRange(nums, 1, n - 1));
    }

    public int robRange(int[] nums, int start, int end) {

        int len = end-start+1;   // We always exclude one house


    if (start == end)
        return nums[start];

        int[] dp = new int[len];

        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start + 1]);

        for (int i = 2; i < len; i++) {
            int take = nums[start + i] + dp[i - 2];
            int skip = dp[i - 1];

            dp[i] = Math.max(take, skip);
        }

        return dp[len - 1];
    }
}