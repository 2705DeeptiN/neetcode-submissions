class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        int lo = 0;
        int hi = findmax(arr);
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            int toth = calculate(arr, mid);
            if (toth <= h)
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        return lo;
    }
    public int findmax(int[] arr) {
       int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxi = Math.max(maxi, arr[i]);
        }
        return maxi;
    }

    public int calculate(int[] arr, int h) {
        int toth = 0;
        for (int i = 0; i < arr.length; i++) {
            toth += Math.ceil((double) arr[i] / h);
        }
        return toth;
    }
}
