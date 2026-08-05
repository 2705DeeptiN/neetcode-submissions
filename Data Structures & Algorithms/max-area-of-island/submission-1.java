class Solution {
    int max=0;

    public int dfs(int[][]grid,int i,int j,boolean[][]vis){
        int n=grid.length;
        int m=grid[0].length;
        
        if(i<0 ||j<0 || i>=n ||j>=m || grid[i][j]==0 || vis[i][j]) return 0;
        vis[i][j]=true;
        return 1+dfs(grid,i-1,j,vis)+dfs(grid,i,j-1,vis)+dfs(grid,i,j+1,vis)+dfs(grid,i+1,j,vis);
    }
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][]vis=new boolean[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && !vis[i][j]){
                    int area=dfs(grid,i,j,vis);
                    max=Math.max(area,max);
                }
            }
        }
        return max;
    }
}
