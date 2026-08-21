class Solution {
    // brute force o(n^3)
    public String longestPalindrome(String s) {
        String res = "";
        int max = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // check every substring
                int l = i;
                int r = j;

                while (l < r && s.charAt(l) == s.charAt(r)) {
                    l++;
                    r--;
                }

                // if v get new sustring with more length
                // update leng and res

                if (l >= r && max < (j - i + 1)) {
                    res = s.substring(i, j + 1);
                    max = j - i + 1;
                }
            }
        }
        return res;
    }
}
