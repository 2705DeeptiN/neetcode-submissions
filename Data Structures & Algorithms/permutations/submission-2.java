class Solution {
    public void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void helper(int[] nums, int idx, List<List<Integer>> ans) {
        if (idx == nums.length - 1) {
            List<Integer> li = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                li.add(nums[i]);
            }
            ans.add(li);
            return;
        }
        for (int i = idx; i < nums.length; i++) {
            swap(i, idx, nums);
            helper(nums, idx + 1, ans);
            swap(i, idx, nums);
        }
    }
    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> ans = new ArrayList<>();

        helper(nums, 0, ans);

        return ans;
    }
}
