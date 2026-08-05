class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // map wil store tht elemnt n its nge

        for (int i = nums2.length - 1; i >= 0; i--) {
            // ylre sanud idr keep popping til u find greater one

            while (!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }
            // emtpy andr -1

            if (st.isEmpty()) {
                map.put(nums2[i], -1);
            } else {
                // put its nge-----peek here gives nge coz kadmi are already popped above

                map.put(nums2[i], st.peek());
            }

            // stck vlg push
            st.push(nums2[i]);
        }

        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            // get frm map
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}