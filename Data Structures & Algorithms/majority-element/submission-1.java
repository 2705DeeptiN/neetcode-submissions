class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        int c = 0;
        int candi = nums[0];

        for (int num : nums) {
            if (c == 0)
                candi = num;

            if (num == candi)
                c++;
            else
                c--;
        }
        return candi;
    }
}