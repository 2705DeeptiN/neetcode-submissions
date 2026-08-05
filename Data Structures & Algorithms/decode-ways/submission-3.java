class Solution {
    public int numDecodings(String s) {
        int[] dp = new int[s.length() + 1];
        // last inda barud
        // last g put 1
        dp[s.length()] = 1;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '0')
                dp[i] = 0; // 0 idr bitt bid
            else {
                dp[i] = dp[i + 1]; // ondh letter togo

                if (i + 1 < s.length()
                    // coz v need to heck second digit aswel so i+1<length
                    && (s.charAt(i) == '1' || s.charAt(i) == '2' && s.charAt(i + 1) < '7')) {
                    dp[i] += dp[i + 2]; // eyrd togo
                }
            }
        }
        return dp[0];
    }
}
