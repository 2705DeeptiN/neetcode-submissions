class Solution {
    private int[]par;
    private int[]rank;

    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        par=new int[n+1];
        rank=new int[n+1];

        for(int i=1;i<=n;i++){
            par[i]=i;
        }
        Arrays.fill(rank,0);

        for(int[]e:edges){
            int u=e[0];
            int v=e[1];

            if(find(u)==find(v)) return e;
            join(u,v);
        }
        return new int[0];
    }

    public int find(int i){
        if(par[i]!=i){
            par[i]=find(par[i]);
        }
        return par[i];
    }

    public void join(int u,int v){
        int rootu=find(u);
        int rootv=find(v);

        if(rootu!=rootv){

            if(rank[rootu]>rank[rootv]){
                par[rootv]=rootu;
            }
            else if(rank[rootu]<rank[rootv]){
                par[rootu]=rootv;
            }
            else par[rootu]=rootv;
            rank[rootv]++;
        }
    }
}
