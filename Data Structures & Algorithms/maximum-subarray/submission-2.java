class Solution {
    // BRUTE FORCE KEEPING ARRAY STARTING CONST
    // O(N^2)

    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                ans = Math.max(sum, ans);
            }
        }
        return ans;
    }
}
