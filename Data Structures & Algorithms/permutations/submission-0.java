class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] valid = new boolean[nums.length];
        helper(nums, ds, valid, ans);
        return ans;
    }

    public void helper(int[] nums, List<Integer> ds, boolean[] valid, List<List<Integer>> ans) {
        if (ds.size() == nums.length) {
            List<Integer> li = new ArrayList<>();
            for (int i = 0; i < ds.size(); i++) {
                li.add(ds.get(i));
            }
            ans.add(li);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (valid[i] == false) {
                ds.add(nums[i]);
                valid[i] = true;
                helper(nums, ds, valid, ans);
                valid[i]=false;
                ds.remove(ds.size() - 1);
            }
        }
    }
}