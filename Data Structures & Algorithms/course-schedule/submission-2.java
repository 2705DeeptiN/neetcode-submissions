class Solution {
    public boolean canFinish(int n, int[][] pre) {
        Queue<Integer>q=new LinkedList<>();
        List<List<Integer>>adj=new ArrayList<>();
int[]indeg=new int[n];
int c=0;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[]p:pre){
            adj.get(p[1]).add(p[0]);
            indeg[p[0]]++;
        }
        for(int i=0;i<n;i++){
            if(indeg[i]==0)q.add(i);
        }

        while(!q.isEmpty()){
            
            int node=q.poll();
            c++;
            for(int next:adj.get(node)){
                indeg[next]--;
                if(indeg[next]==0)q.add(next);
            }
        }

        return c==n;
    }
}
