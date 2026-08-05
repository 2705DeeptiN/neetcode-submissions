class Solution {
    public boolean dfs(int node,int parent,Set<Integer>vis,List<List<Integer>>adj){
        if(vis.contains(node)) return false;
        vis.add(node);
        for(int next:adj.get(node)){
            if(next==parent){
                continue;
            }
            if(!dfs(next,node,vis,adj)) return false;
        }
        return true;
    }
    public boolean validTree(int n, int[][] edges) {
if(edges.length>n-1)return false;
      
        ArrayList<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int []e:edges){
            adj.get(e[1]).add(e[0]);
            adj.get(e[0]).add(e[1]);
        }
        Set<Integer>vis=new HashSet<>();
        if(!dfs(0,-1,vis,adj)){
            return false;
        }
        return vis.size()==n;
        
        
    }
}
