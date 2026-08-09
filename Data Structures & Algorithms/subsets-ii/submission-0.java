class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        Arrays.sort(nums);

        dfs(0, nums, li, ans);
        return ans;
    }

    public void dfs(int i, int[] nums, List<Integer> li, List<List<Integer>> ans) {
       
            ans.add(new ArrayList<>(li));
       

        for(int j=i;j<nums.length;j++){

            if(j>i && nums[j]==nums[j-1]) continue;

            li.add(nums[j]);
            dfs(j+1,nums,li,ans);
            li.remove(li.size()-1);
        }
    }
}
