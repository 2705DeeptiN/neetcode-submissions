class Solution {
    public int minPathSum(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        int[][] dp = new int[n + 1][m + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) // top left elmnt
                    dp[i][j] = arr[i][j];

                else if (i == 0)
                    // first row
                    dp[i][j] = arr[i][j] + dp[i][j - 1];

                else if (j == 0)
                    // frst colmn
                    dp[i][j] = arr[i][j] + dp[i - 1][j];

                else {
                    // current val+alle barak min value
                    dp[i][j] = arr[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n - 1][m - 1];
    }
}