class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        int[] ans = new int[2];
        int l = 0;
        int hi = n-1;

        while (l <=hi) {
            int mid = nums[l] + nums[hi];

            if (mid == target) {
                ans[0] = l+1;
                ans[1] = hi+1;
                return ans;
            }
            if (mid < target) {
                l++;
            }else hi--;
        }
        return ans;
    }
}
