class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // i -> last actual element in nums1
        // j -> last element in nums2
        // k -> last position in nums1
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        // Keep going until all elements of nums2 are placed
        while (j >= 0) {

            // If nums1 still has elements
            // and its current element is bigger,
            // place nums1[i] at the back
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            }

            // Otherwise place nums2[j]
            else {
                nums1[k] = nums2[j];
                j--;
            }

            // Move the position where we will place the next element
            k--;
        }
    }
}