class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();

        // Build frequency map
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            if (count.containsKey(num)) {
                count.put(num, count.get(num) + 1);
            } else {
                count.put(num, 1);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            count.put(nums[i], count.get(nums[i]) - 1);

            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                count.put(nums[j], count.get(nums[j]) - 1);

                int target = -(nums[i] + nums[j]);

                if (count.containsKey(target) && count.get(target) > 0) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], target);
                    Collections.sort(triplet);
                    res.add(triplet);
                }

                count.put(nums[j], count.get(nums[j]) + 1);
            }

            count.put(nums[i], count.get(nums[i]) + 1);
        }

        return new ArrayList<>(res);
    

    }
}
