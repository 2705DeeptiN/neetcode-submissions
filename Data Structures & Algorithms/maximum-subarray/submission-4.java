class Solution {
    public int maxSubArray(int[] nums) {
        int maxx = Integer.MIN_VALUE;
        int sum = 0;

        for (int ele : nums) {
            sum += ele;

maxx = Math.max(sum, maxx);
            if (sum < 0)
                sum = 0;

            
        }
        return maxx;
    }
}
