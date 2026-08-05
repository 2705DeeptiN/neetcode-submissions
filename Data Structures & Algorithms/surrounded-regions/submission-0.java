class Solution {
    public void solve(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
boolean[][]vis=new boolean[n][m];
        for (int j = 0; j < m; j++) {
            // top row
            if (grid[0][j] == 'O')
                dfs(0, j, grid);

            // bottom row
            if (grid[n - 1][j] == 'O')
                dfs(n - 1, j, grid);
        }

        for (int i = 0; i < n; i++) {
            //first col
            if (grid[i][0] == 'O')
                dfs(i, 0, grid);

//last col
            if (grid[i][m - 1] == 'O')
                dfs(i, m - 1, grid);
        }


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='O'){
                    grid[i][j]='X';
                }
                else if(grid[i][j]=='#'){
                    grid[i][j]='O';
                }
            }
            
        }
    }

    public void dfs(int i,int j,char[][]grid){

 int n = grid.length;
        int m = grid[0].length;

        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]!='O') return;

        grid[i][j]='#';

        dfs(i,j-1,grid);
        dfs(i,j+1,grid);
        dfs(i-1,j,grid);
        dfs(i+1,j,grid);
    }
}
