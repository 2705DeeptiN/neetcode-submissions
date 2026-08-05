class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        int[][] dp = new int[n + 1][m + 1];
        for (int[] d : dp) {
            Arrays.fill(d, -1);
        }

        return solve(arr, dp, n - 1, m - 1);
    }

    public int solve(int[][] arr, int[][] dp, int i, int j) {
        if (i < 0 || j < 0)
            return 0;

        if (arr[i][j] == 1)
            return 0;

        if (i == 0 && j == 0)
            return 1;

        if (dp[i][j] != -1)
    return dp[i][j];

        return dp[i][j] = solve(arr, dp, i, j - 1) + solve(arr, dp, i - 1, j);
    }
}