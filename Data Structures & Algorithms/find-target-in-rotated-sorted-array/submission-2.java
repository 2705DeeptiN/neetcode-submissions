class Solution {
    public int search(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[lo] <= arr[mid]) {
                // left sorted

                if (arr[mid] >=target && arr[lo]<=target)
                    hi = mid - 1;
                else
                    lo = mid + 1;
            }

            else // ryt sorted{
                if (arr[mid] <=target && arr[hi] >= target)
                    lo = mid +1;
                else
                    hi= mid - 1;
        }

        return -1;
    }
}
