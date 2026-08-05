class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] pre = new int[n];
        pre[0] = nums[0];
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1]+nums[i];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int c = 0;
        for (int num : pre) {
            if (num == k)
                c++;
            int rem = num - k;

            if (map.containsKey(rem))
                c += map.get(rem);

            if (map.containsKey(num)) {
                int freq = map.get(num);
                map.put(num, freq + 1);
            }

            else
                map.put(num, 1);
        }

        return c;
    }
}