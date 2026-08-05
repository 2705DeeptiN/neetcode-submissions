class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int c=0;
        boolean[][]vis=new boolean[n][m];

for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){

        if(grid[i][j]=='1' && !vis[i][j]){
            c++;
            dfs(grid,i,j,vis);
        }

    }
}
return c;
    }

    public void dfs(char[][] grid,int i,int j,boolean[][]vis){
        int n=grid.length;
        int m=grid[0].length;

        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]=='0' || vis[i][j])return;
        vis[i][j]=true;

        dfs(grid,i-1,j,vis);
        dfs(grid,i,j-1,vis);
        dfs(grid,i+1,j,vis);
        dfs(grid,i,j+1,vis);
    }
}
