class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        dfs(0, target, res, temp, nums);
        return res;
    }
    public void dfs(int i, int t, List<List<Integer>> res, List<Integer> temp, int[] nums) {
        if (t == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }
        if (t < 0)
            return;

        Arrays.sort(nums);
        for (int j = i; j < nums.length; j++) {
            if (j > i && nums[j] == nums[j - 1])
                continue;

            if (nums[j] > t)
                break;

            temp.add(nums[j]);
            dfs(j + 1, t - nums[j], res, temp, nums);
            temp.remove(temp.size() - 1);
        }
    }
}