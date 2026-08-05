class Solution {



    int c=0;
    public void dfs(int[][]grid,int i,boolean[]vis){
        

        vis[i]=true;
        for(int j=0;j<grid.length;j++){
            if(grid[i][j]==1 && !vis[j]){
                dfs(grid,j,vis);
            }
        }
       

    }

    public int findCircleNum(int[][] grid) {
        boolean[]vis=new boolean[grid.length];;

        for(int i=0;i<grid.length;i++){
          
                if(!vis[i]){
                    c++;
                    dfs(grid,i,vis);
                }
        }
    
    return c;
}
}