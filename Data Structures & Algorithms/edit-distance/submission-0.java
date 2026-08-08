class Solution {
    public int minDistance(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();

        int[][] dp = new int[l1 + 1][l2 + 1];
        for (int[] r : dp) Arrays.fill(r, -1);

        return solve(0, 0, s1, s2, dp);
    }

    public int solve(int i, int j, String s1, String s2, int[][] dp) {
        int l1 = s1.length();
        int l2 = s2.length();

        // frst string mugit
        if (i == l1)
            dp[i][j] = l2 - j;

        // sec string mugit
        if (j == l2)
            dp[i][j] = l1 - i;

        if (dp[i][j] != -1)
            return dp[i][j];

        // both chars matching
        if (s1.charAt(i) == s2.charAt(j))
            return dp[i][j] = solve(i + 1, j + 1, s1, s2, dp);

        // 3 ops posble..min idid select
        int insert = 1 + solve(i, j + 1, s1, s2, dp);
        int delete = 1 + solve(i + 1, j, s1, s2, dp);
        int replace = 1 + solve(i + 1, j + 1, s1, s2, dp);

        dp[i][j] = Math.min(insert, Math.min(replace, delete));

        return dp[i][j];
    }
}
