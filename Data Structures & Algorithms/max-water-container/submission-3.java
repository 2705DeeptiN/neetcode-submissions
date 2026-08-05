class Solution {
    
    //brute force chckng all pairs
    public int maxArea(int[] arr) {
        int maxx = 0;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int area = (j - i) * (Math.min(arr[i], arr[j]));

                maxx = Math.max(area, maxx);
            }
        }
        return maxx;
    }
}
