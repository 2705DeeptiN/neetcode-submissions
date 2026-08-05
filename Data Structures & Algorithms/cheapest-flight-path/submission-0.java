class Pair {
    int frst;
    int sec;
    Pair(int frst, int sec) {
        this.frst = frst;
        this.sec = sec;
    }
}

class Tuple {
    int frst;
    int sec;
    int third;
    Tuple(int frst, int sec, int third) {
        this.frst = frst;
        this.sec = sec;
        this.third = third;
    }
}

class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        int[]dist=new int[n];
        Arrays.fill(dist,(int)1e9);

        for(int[]fl:flights){
            adj.get(fl[0]).add(new Pair(fl[1],fl[2]));
        }

        Queue<Tuple>q=new LinkedList<>();
        q.add(new Tuple(0,src,0));
        
        dist[src]=0;

        while(!q.isEmpty()){
            Tuple cur=q.poll();

            int stops=cur.frst;
            int node=cur.sec;
            int d=cur.third;

            if(stops>k) continue;

            for(Pair next:adj.get(node)){
                int no=next.frst;
                int wt=next.sec;

                if(d+wt<dist[no] && stops<=k){
                    dist[no]=d+wt;

                    q.add(new Tuple(stops+1,no,d+wt));
                }
            }
        }
        return dist[dst]==(int)1e9?-1:dist[dst];
       
    }
}
