class Solution {
    public boolean canFinish(int n, int[][] pre) {

        ArrayList<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[]p:pre){
            adj.get(p[1]).add(p[0]);
        }

        boolean[]vis=new boolean[n];
        boolean[]path=new boolean[n];

        for(int i=0;i<n;i++){
            if(!vis[i] && dfs(i,adj,vis,path)) return false;
        }
        return true;
        
    }

    public boolean dfs(int node,ArrayList<List<Integer>>adj,boolean[]vis,boolean[]path){
        vis[node]=path[node]=true;

        for(int next:adj.get(node)){
            if(!vis[next] && dfs(next,adj,vis,path)) return true;
            else if (path[next]) return true; 
        }
        path[node]=false;
        return false;
    }
}
