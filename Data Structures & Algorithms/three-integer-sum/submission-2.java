class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;

        //HshSet<List>  avoids duplicates so used rather than list<list
        HashSet<List<Integer>> ans = new HashSet<>();

        for (int i = 0; i < n; i++) {
            HashSet<Integer> set = new HashSet<>();

            for (int j = i + 1; j < n; j++) {
                int need = -(nums[i] + nums[j]);

                if (set.contains(need)) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(need);

                    Collections.sort(temp);
                    ans.add(temp);
                }
                set.add(nums[j]);
            }
        }

        return new ArrayList<>(ans);
    }
}
