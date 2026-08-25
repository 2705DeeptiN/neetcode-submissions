class Solution {
    public int findDuplicate(int[] nums) {
        int slo = 0;
        int fast = 0;

        do {
            slo = nums[slo];
            fast = nums[nums[fast]];
        } while (slo != fast);

        slo = 0;
        while (slo != fast) {
            slo = nums[slo];
            fast = nums[fast];
        }

        return slo;
    }
}