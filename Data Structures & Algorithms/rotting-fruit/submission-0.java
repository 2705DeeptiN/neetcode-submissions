class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int fresh=0;
 Queue<int[]>q=new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1) fresh++;
            
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
            }
        }

        if(fresh==0) return 0;

        int min=0;

        int[][]dir={{1,0},{-1,0},{0,1},{0,-1}};

        
       

        while(!q.isEmpty()){
            int s=q.size();
            for(int k=0;k<s;k++){
                int[]curr=q.poll();
                int r=curr[0];
                int c=curr[1];
                
                for(int[]d:dir){
                    int nr=r+d[0];
                    int nc=c+d[1];

                    if(nr>=0 && nc>=0 && nr<n && nc<m && grid[nr][nc]==1){
                        grid[nr][nc]=2;
                        fresh--;
                        q.add(new int[]{nr,nc});
                    }
                }
            }
        
            if(!q.isEmpty())min++;
        }
            return  fresh==0? min:-1;

        }
           
        }


