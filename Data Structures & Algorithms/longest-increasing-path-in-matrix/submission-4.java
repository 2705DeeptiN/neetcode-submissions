class Solution {
    public int longestIncreasingPath(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int maxlen = 0;
        int[][] dp = new int[n][m];
        for (int[] ele : dp) {
            Arrays.fill(ele, -1);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maxlen = Math.max(maxlen, dfs(i, j,arr,dp));
            }
        }
        return maxlen;
    }

    public int dfs(int i, int j, int[][] arr,int[][]dp) {
        int c = 1;
        int n = arr.length;
        int m = arr[0].length;

if(dp[i][j]!=-1) return dp[i][j];
        if (i < 0 || j < 0 || i >= n || j >= m)
            return 0;

        if (i > 0 && arr[i - 1][j] > arr[i][j]) {
            c = Math.max(c, 1 + dfs(i - 1, j,arr,dp));
        }

        if (j > 0 && arr[i][j - 1] > arr[i][j]) {
            c = Math.max(c, 1 + dfs(i, j - 1,arr,dp));
        }

        if (i + 1 < n && arr[i + 1][j] > arr[i][j]) {
            c = Math.max(c, 1 + dfs(i + 1, j,arr,dp));
        }

        if (j + 1 < m && arr[i][j + 1] > arr[i][j]) {
            c = Math.max(c, 1 + dfs(i, j + 1,arr,dp));
        }
        return dp[i][j]=c;
    }
}
