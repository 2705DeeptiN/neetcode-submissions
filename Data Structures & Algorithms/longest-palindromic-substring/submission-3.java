class Solution {
    // https://youtu.be/UflHuQj6MVA?si=RmBmA7cDEKSUIf0D
    
    public String longestPalindrome(String s) {
        int len = 0;
        int n = s.length();
        String res = "";
        boolean[][] dp = new boolean[n][n];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                // frst check boundary conditions
                // then valgindu shld be palindrome and tht is applicable only if the lemgth is 3 or
                // more so v gave or condition
                if (s.charAt(i) == s.charAt(j) && (j - i < 2 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    // hosad dodud adr updaye length and res
                    if (len < j - i + 1) {
                        len = j - i + 1;
                        res = s.substring(i, j + 1);
                    }
                }
            }
        }
        return res;
    }
}
