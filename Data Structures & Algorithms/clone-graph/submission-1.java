
class Solution {
    public Node cloneGraph(Node node) {
        if(node==null) return null;

        HashMap<Node,Node>map=new HashMap<>();

        return dfs(node,map);
    }
    public Node dfs(Node node,HashMap<Node,Node>map){
        if(node==null) return null;

        if(map.containsKey(node))return map.get(node);

        Node neww=new Node(node.val);
        map.put(node,neww);

        for(Node next:node.neighbors){
            neww.neighbors.add(dfs(next,map));
        }
        return neww;
    }
}