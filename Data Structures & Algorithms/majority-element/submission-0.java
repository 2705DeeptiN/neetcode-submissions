class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int ele : nums) {
            if (map.containsKey(ele)) {
                int freq = map.get(ele);
                map.put(ele, freq + 1);
            } else
                map.put(ele, 1);
        }

        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() > nums.length / 2)
                return it.getKey();
        }
        return 0;
    }
}