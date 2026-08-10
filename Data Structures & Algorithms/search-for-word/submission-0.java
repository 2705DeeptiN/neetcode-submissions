class Solution {
    public boolean exist(char[][] grid, String word) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (solve(i, j, 0, grid, word, vis))
                    return true;
            }
        }
        return false;
    }
    public boolean solve(int i, int j, int idx, char[][] grid, String word, boolean[][] vis) {
        int n = grid.length;
        int m = grid[0].length;

        if (i < 0 || j < 0 || i >= n || j >= m)
            return false;

        if (vis[i][j] || grid[i][j] != word.charAt(idx))
            return false;

        if (idx == word.length() - 1)
            return true;

        vis[i][j] = true;
        boolean a = solve(i + 1, j, idx + 1, grid, word, vis);
        boolean b = solve(i - 1, j, idx + 1, grid, word, vis);
        boolean c = solve(i, j - 1, idx + 1, grid, word, vis);
        boolean d = solve(i, j + 1, idx + 1, grid, word, vis);

        vis[i][j] = false;

        return a || b || c || d;
    }
}
