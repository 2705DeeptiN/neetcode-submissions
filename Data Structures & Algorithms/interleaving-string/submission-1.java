class Solution {
    //memo+recursion
    public boolean isInterleave(String s1, String s2, String s3) {
        int l1 = s1.length();
        int l2 = s2.length();
        int l3 = s3.length();
        if (l1 + l2 != l3)
            return false;

Boolean [][]dp=new Boolean[l1+1][l2+1];

        return solve(0, 0, s1, s2, s3,dp);
    }

    public boolean solve(int i, int j, String s1, String s2, String s3,Boolean[][]dp) {
        int l1 = s1.length();
        int l2 = s2.length();

if(dp[i][j]!=null) return dp[i][j];

        // finished both strings then succesful
        if (i == l1 && j == l2)
            return dp[i][j]=true;

        // if both strings characters match return either of them
        if (i < l1 && j < l2 && s1.charAt(i) == s3.charAt(i + j)
            && s2.charAt(j) == s3.charAt(i + j))
            return dp[i][j]=solve(i + 1, j, s1, s2, s3,dp) || solve(i, j + 1, s1, s2, s3,dp);

        // if char if s1 matches go ahead
        else if (i < l1 && s1.charAt(i) == s3.charAt(i + j))
            return  dp[i][j]=solve(i + 1, j, s1, s2, s3,dp);

        // similarly for s2
        else if (j < l2 && s2.charAt(j) == s3.charAt(i + j))
            return dp[i][j]=solve(i, j + 1, s1, s2, s3,dp);

        // gati illa andr false
        return dp[i][j]=false;
    }
}
