class Solution {
    public int totalNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();

        char[][] board = new char[n][n];
        for (char[] r : board) {
            Arrays.fill(r, '.');
        }
        helper(board, 0, ans);

        return ans.size();
    }

    public void helper(char[][] board, int row, List<List<String>> ans) {
        int n = board.length;
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
            return;
        }

        for (int j = 0; j < n; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                helper(board, row + 1,ans);
                board[row][j] = '.';
            }
        }
    }

    public boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;

        for (int j = 0; j < n; j++) {
            if (board[row][j] == 'Q')
                return false;
        }

        for (int i = 0; i < n; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        int i = row;
        int j = col;

        // north east ->j--,i--
        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q')
                return false;
            i--;
            j--;
        }

        i = row;
        j = col;

        // north west ->j--,i++
        while (i < n && j >= 0) {
            if (board[i][j] == 'Q')
                return false;
            i++;
            j--;
        }

        i = row;
        j = col;

        // outh west ->j++,i++
        while (i < n && j < n) {
            if (board[i][j] == 'Q')
                return false;
            i++;
            j++;
        }

        i = row;
        j = col;

        // outh east  ->j++,i--
        while (j < n && i >= 0) {
            if (board[i][j] == 'Q')
                return false;
            j++;
            i--;
        }

        return true;
    }
}
