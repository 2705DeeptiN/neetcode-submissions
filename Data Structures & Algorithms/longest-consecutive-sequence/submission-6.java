class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for (int ele : nums) set.add(ele);

        int max = 0;
        for (int ele : nums) {
            if (!set.contains(ele - 1)) {
                int len = 1;
                int cur = ele;

                while (set.contains(cur + 1)) {
                    len++;
                    cur++;
                }
                max = Math.max(len, max);
            }
        }
        return max;
    }
}
