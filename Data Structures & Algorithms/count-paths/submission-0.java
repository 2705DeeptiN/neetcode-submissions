class Solution {
    int[][] dp;
    public int uniquePaths(int m, int n) {
        dp = new int[m + 1][n + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // yere starting line or clmn vlg idr 1 way available so 1 instea of 0
                if (i == 0 || j == 0)
                    dp[i][j] = 1;
                else
                    // from top+left to reach bottom rught
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}
