class Solution {
    public void setZeroes(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        // first check if there are any zeroes in frstrow or frstcol
        boolean frstrow = false;
        boolean frstcol = false;

        // check if any elemnt in frst col has zero
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0) { //[i][0] means traversing 0th column
                frstcol = true;
                break;
            }
        }

        // check if any element in first row has zero
        for (int j = 0; j < n; j++) {
            if (arr[0][j] == 0) {
                frstrow = true;
                break;
            }
        }

        // now if found at any index make tht i n jth thng as 0
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        // frst column vlg 0 idr atr crspnding do 0
        for (int i = 1; i < m; i++) {
            if (arr[i][0] == 0) {
                for (int j = 1; j < n; j++) {
                    arr[i][j] = 0;
                }
            }
        }

        // using frst row thng do thm 0
        for (int j = 1; j < n; j++) {
            if (arr[0][j] == 0) {
                for (int i = 1; i < m; i++) {
                    arr[i][j] = 0;
                }
            }
        }

        //frstrow vlg idr atr col 0 haak

        if (frstrow) {
            for (int j = 0; j < n; j++) {
                arr[0][j] = 0;
            }
        }

        if (frstcol) {
            for (int i = 0; i < m; i++) {
                arr[i][0] = 0;
            }
        }
    }
}
