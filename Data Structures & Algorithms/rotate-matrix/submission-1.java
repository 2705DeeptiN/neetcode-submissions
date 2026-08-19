class Solution {
    public void rotate(int[][] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int t = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = t;
            }
        }

        for (int i = 0; i < n; i++) {
            int l = 0;
            int r = n - 1;

            while (l < r) {
                int t = arr[i][l];
                arr[i][l] = arr[i][r];
                arr[i][r] = t;

                l++;
                r--;
            }
        }
    }
}


