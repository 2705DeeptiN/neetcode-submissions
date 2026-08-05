class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;

        // have 2 boolean to check visited for pacific and atlantc separtely

        boolean[][] pac = new boolean[n][m];
        boolean[][] atl = new boolean[n][m];

        List<List<Integer>> ans = new ArrayList<>();

        // pacific top
        for (int j = 0; j < m; j++) {
            dfs(0, j, pac, heights);
        }
        // pacific left
        for (int i = 0; i < n; i++) {
            dfs(i, 0, pac, heights);
        }

        // atlantic ryt
        for (int i = 0; i < n; i++) {
            dfs(i, m - 1, atl, heights);
        }

        // atlantic bottom
        for (int j = 0; j < m; j++) {
            dfs(n - 1, j, atl, heights);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // both have to be visited
                if (pac[i][j] && atl[i][j]) {
                    // add them in ans
                    ans.add(Arrays.asList(i, j));
                }
            }
        }
        return ans;
    }

    public void dfs(int i, int j, boolean[][] vis, int[][] heights) {
        // mark tht as visited
        vis[i][j] = true;

        int r = i;
        int c = j;

        // all 4 directions  need to be checked

        int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        for (int[] d : dir) {
            int nr = r + d[0];
            int nc = c + d[1];

            // if any error  for grid condition just continue

            if (nr < 0 || nc < 0 || nr >= heights.length || nc >= heights[0].length)
                continue;

            // if visited already continue
            if (vis[nr][nc])
                continue;

            // yellare heights kadmi idru skip
            if (heights[nr][nc] < heights[r][c])
                continue;

            // do dfs of those
            dfs(nr, nc, vis, heights);
        }
    }
}
