class Solution {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;

                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }
                ans = Math.max(sum, ans);
            }
        }
        return ans;
    }
}