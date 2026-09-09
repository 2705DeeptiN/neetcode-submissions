class Solution {
    public int[] dailyTemperatures(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[nums.length];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[st.peek()] < nums[i]) {
                int idx = st.pop();
                ans[idx] = i - idx;
            }

            st.push(i);
        }
        return ans;
    }
}
