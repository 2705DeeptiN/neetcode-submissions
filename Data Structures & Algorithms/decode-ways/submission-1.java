class Solution {
    public int numDecodings(String s) {
        int[] dp = new int[s.length()];
        Arrays.fill(dp, -1);
        return solve(0, s, dp);
    }
    public int solve(int i, String s, int[] dp) {

        
        if (i == s.length())
            return 1;

        if (s.charAt(i) == '0')
            return 0;

        if (dp[i] != -1)
            return dp[i];

        int one = solve(i + 1, s,dp);
        int two = 0;
        if (i < s.length() - 1) {
            if (s.charAt(i) == '1' || (s.charAt(i) == '2' && s.charAt(i + 1) < '7'))
                // one += solve(i + 2, s);
                two = solve(i + 2, s,dp);
        }
        return dp[i]=one + two;
    }
}
