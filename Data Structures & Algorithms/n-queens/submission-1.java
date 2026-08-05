class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];

        // first fill full board with .
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        // call function starting from 0th row
        helper(ans, 0, board);
        return ans;
    }

    public void helper(List<List<String>> ans, int row, char[][] board) {
        int n = board.length;

        // row last g bandr put tht in ans
        if (row == n) {
            List<String> li = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String s = "";
                for (int j = 0; j < n; j++) {
                    s += board[i][j];
                }
                li.add(s);
            }
            ans.add(li);
            // return is must
            return;
        }

        for (int j = 0; j < n; j++) {
            // check if safe for new coming queen
            if (isSafe(board, row, j)) {
                // only if safe mark q and call functiom for next row
                board[row][j] = 'Q';
                helper(ans, row + 1, board);
                // backtracking
                board[row][j] = '.';
            }
        }
    }

    public boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
        // checking for column
        for (int j = 0; j < n; j++) {
            if (board[row][j] == 'Q')
                return false;
        }

        // checking for rows
        for (int i = 0; i < n; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        int i = row;
        int j = col;
        // north east i++,j--
        while (j >= 0 && i < n) {
            if (board[i][j] == 'Q')
                return false;
            i++;
            j--;
        }

        i = row;
        j = col;
        // south west j++,i--
        while (i >= 0 && j < n) {
            if (board[i][j] == 'Q')
                return false;
            i--;
            j++;
        }

        i = row;
        j = col;
        // north west j--,i--
        while (j >= 0 && i >= 0) {
            if (board[i][j] == 'Q')
                return false;
            i--;
            j--;
        }

        i = row;
        j = col;
        // south east j++,i++
        while (j < n && i < n) {
            if (board[i][j] == 'Q')
                return false;
            i++;
            j++;
        }

        return true;
    }
}
