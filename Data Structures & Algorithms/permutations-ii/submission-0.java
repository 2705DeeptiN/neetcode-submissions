class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        boolean[] valid = new boolean[nums.length];
        Arrays.sort(nums);
        helper(nums, li, ans, valid);
        return ans;
    }
    public void helper(int[] nums, List<Integer> li, List<List<Integer>> ans, boolean[] valid) {
        if (li.size() == nums.length) {
            ans.add(new ArrayList<>(li));
            return;
        }
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (valid[i])
                continue;
            if (set.contains(nums[i]))
                continue;

            set.add(nums[i]);
            li.add(nums[i]);
            valid[i] = true;

            helper(nums, li, ans, valid);
            valid[i] = false;
            li.remove(li.size() - 1);
        }
    }
}