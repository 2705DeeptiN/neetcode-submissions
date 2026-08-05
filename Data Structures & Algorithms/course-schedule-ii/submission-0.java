class Solution {
    public int[] findOrder(int n, int[][] pre) {
        int []indeg=new int[n];
        ArrayList<Integer>ans=new ArrayList<>();
        ArrayList<List<Integer>>adj=new ArrayList<>();
        Queue<Integer>q=new LinkedList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
              }
        
        
        for(int []p:pre){
            adj.get(p[1]).add(p[0]);
            indeg[p[0]]++;
        }

        for(int i=0;i<n;i++){
            if(indeg[i]==0)q.add(i);
        }

        while(!q.isEmpty()){
            int node=q.poll();
            
            ans.add(node);
            for(int next:adj.get(node)){
                indeg[next]--;
                if(indeg[next]==0)q.add(next);
            }
        }
        if(ans.size()<n)return new int[0];

        int []res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}
