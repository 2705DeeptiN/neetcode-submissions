class Solution {
    public int countComponents(int n, int[][] edges) {
        boolean[]vis=new boolean[n];
    ArrayList<List<Integer>>adj=new ArrayList<>();

    int c=0;

    for(int i=0;i<n;i++){
        adj.add(new ArrayList<>());
    }
    for(int[]ed:edges){
        adj.get(ed[0]).add(ed[1]);
        adj.get(ed[1]).add(ed[0]);
    }
    for(int i=0;i<n;i++){
        if(!vis[i]){
            c++;
            dfs(i,vis,adj);
        }
    }
    return c;
    }

    public void dfs(int i,boolean[]vis, ArrayList<List<Integer>>adj){
        vis[i]=true;

        for(int n:adj.get(i)){
            if(!vis[n]){
                dfs(n,vis,adj);
            }
        }
    }
}
