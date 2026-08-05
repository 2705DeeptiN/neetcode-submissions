class Solution {
    int max=0;
    private static final int[][]directions={{1,0},{-1,0},{0,1},{0,-1}};
    public int bfs(int[][]grid,int i,int j){
        int n=grid.length;
        int m=grid[0].length;
        
        Queue<int[]>q=new LinkedList<>();
        grid[i][j]=0;
        q.add(new int[]{i,j});
        int res=1;

        while(!q.isEmpty()){
            int[]node=q.poll();
            int r=node[0];
            int c=node[1];

            for(int[]dir:directions){
                int nr=r+dir[0];
                int nc=c+dir[1];

                if(nc>=0 && nr>=0 && nr<n &&nc<m && grid[nr][nc]==1){
                    q.add(new int[]{nr,nc});
                    grid[nr][nc]=0;
                    res++;
                }
            }
        }return res;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 ){
                    int area=bfs(grid,i,j);
                    max=Math.max(area,max);
                }
            }
        }
        return max;
    }
}
