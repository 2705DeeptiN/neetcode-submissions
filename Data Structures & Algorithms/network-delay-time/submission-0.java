class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>>adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            
                adj.add(new ArrayList<>());
            
        }
        for(int[]t:times){
            int u=t[0];
            int v=t[1];
            int w=t[2];
            adj.get(u).add(new int[]{v,w});
        }

        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        int c=0;
        int ans=0;
boolean []vis=new boolean[n+1];
        pq.add(new int[]{0,k});
        while(!pq.isEmpty()){
            int[]cur=pq.poll();
  
            int d=cur[0];
            int node=cur[1];
            if(vis[node]) continue;
            vis[node]=true;
          c++;
            ans=d;

            for(int[]nei:adj.get(node)){
                int v=nei[0];
                int wt=nei[1];
               
                if(!vis[v]){
                    pq.add(new int[]{d+wt,v});
                }
            }
        }
        return c==n?ans:-1;
        }
    }
