class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;

        int[] ans = new int[m + n];
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                ans[i + j] = nums1[i];
                i++;
            } else {
                ans[i + j] = nums2[j];
                j++;
            }
        }
        while (i < m) {
            ans[i + j] = nums1[i];
            i++;
        }

        while (j < n) {
            ans[i + j] = nums2[j];
            j++;
        }
        for (int x = 0; x < m + n; x++) {
            nums1[x] = ans[x];
        }
    }
}