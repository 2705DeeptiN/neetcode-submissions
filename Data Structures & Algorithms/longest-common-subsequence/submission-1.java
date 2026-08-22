class Solution {
    int[][] dp;

    public int longestCommonSubsequence(String text1, String text2) {
        int l1 = text1.length();
        int l2 = text2.length();

        dp = new int[l1][l2];

        for (int[] r : dp) Arrays.fill(r, -1);

        return solve(0, 0, text1, text2);
    }

    public int solve(int i, int j, String text1, String text2) {
        int l1 = text1.length();
        int l2 = text2.length();

        if (i == l1 || j == l2)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        if (text1.charAt(i) == text2.charAt(j)) {
            return dp[i][j] = 1 + solve(i + 1, j + 1, text1, text2);
        }
        int skipa = solve(i + 1, j, text1, text2);
        int skipb = solve(i, j + 1, text1, text2);

        return dp[i][j] = Math.max(skipa, skipb);
    }
}