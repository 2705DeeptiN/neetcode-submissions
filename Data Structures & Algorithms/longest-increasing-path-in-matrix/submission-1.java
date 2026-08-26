class Solution {

    //recursion
    public int longestIncreasingPath(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        int[][] dp = new int[n][m];
        int maxlen = 0;
        for (int[] r : dp) Arrays.fill(r, -1);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maxlen = Math.max(maxlen, dfs(i, j, arr,dp));
            }
        }
        return maxlen;
    }
    public int dfs(int i, int j, int[][] arr,int[][]dp) {
        int n = arr.length;
        int m = arr[0].length;
        if(dp[i][j]!=-1) return dp[i][j];
        int best = 1;

        if (i < 0 || j < 0 || i >= n || j >= m)
            return 0;
       
       if(i-1>=0 && arr[i-1][j]>arr[i][j]){
        best=Math.max(best,1+dfs(i-1,j,arr,dp));
       }
       if(j-1>=0 && arr[i][j-1]>arr[i][j]){
        best=Math.max(best,1+dfs(i,j-1,arr,dp));
       }
       if(i+1<n && arr[i+1][j]>arr[i][j]){
        best=Math.max(best,1+dfs(i+1,j,arr,dp));
       }
       if(j+1<m && arr[i][j+1]>arr[i][j]){
        best=Math.max(best,1+dfs(i,j+1,arr,dp));
       }

       return dp[i][j]=best;

    }
}
