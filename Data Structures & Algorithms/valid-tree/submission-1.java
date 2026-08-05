class Solution {

    public boolean dfs(int child,int p,HashSet<Integer>vis,ArrayList<List<Integer>>adj){
        if(vis.contains(child))return false;
        vis.add(child);

        for(int next:adj.get(child)){
            if(next==p)continue;
           if(!dfs(next,child,vis,adj)) return false;
        }
        return true;
    }
    public boolean validTree(int n, int[][] edges) {
        if(edges.length>n-1) return false;

        ArrayList<List<Integer>>adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[]e:edges){
            adj.get(e[0]).add(e[1]);
             adj.get(e[1]).add(e[0]);
        }
HashSet<Integer>vis=new HashSet<>();
        if(!dfs(0,-1,vis,adj))return false;

return vis.size()==n;
    }
}
