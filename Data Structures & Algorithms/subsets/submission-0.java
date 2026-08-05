class Solution {
    public void dfs(int i, int[] nums, List<Integer> subs, List<List<Integer>> res) {
        if (i >= nums.length) {
            // if i reaches end of nums array add it to res
            res.add(new ArrayList<>(subs));
            return;
        }

        // v hav 2 options in generating subsets pick or nt pick

        subs.add(nums[i]); // pick
        dfs(i + 1, nums, subs, res); // go next
        subs.remove(subs.size() - 1); // remove old one (backtracking)

        dfs(i + 1, nums, subs, res); // dont pick n go next drctly
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subs = new ArrayList<>();
        // start from frstr elemnt
        dfs(0, nums, subs, res);
        return res;
    }
}
