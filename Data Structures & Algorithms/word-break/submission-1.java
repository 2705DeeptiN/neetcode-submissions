class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int[] dp = new int[s.length()];
        Arrays.fill(dp, -1);
        return solve(0, s, wordDict, dp);
    }
    public boolean solve(int i, String s, List<String> wordDict, int[] dp) {
        if (i == s.length())
            return true;

        if (dp[i] != -1)
            return dp[i] == 1;
        for (String w : wordDict) {
            if (i + w.length() <= s.length()) {
                if (w.equals(s.substring(i, i + w.length()))
                    && solve(i + w.length(), s, wordDict, dp)) {
                    dp[i] = 1;
                    return true;
                }
            }
        }
        dp[i] = 0;
        return false;
    }
}
