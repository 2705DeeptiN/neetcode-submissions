class Solution {
    List<String>ans=new ArrayList<>();
    HashMap<String,PriorityQueue<String>>map=new HashMap<>();

    public List<String> findItinerary(List<List<String>> tickets) {
        for(List<String>t:tickets){
           String from=t.get(0);
           String to=t.get(1);

           if(!map.containsKey(from)){
            map.put(from,new PriorityQueue<>());
           }
           map.get(from).add(to);
        }
        dfs("JFK");
        
        Collections.reverse(ans);
        return ans;

    }

    public void dfs(String airport){
        while(map.containsKey(airport) && !map.get(airport).isEmpty()){
          String next=map.get(airport).poll();
          dfs(next);
        }
        ans.add(airport);
    }

}