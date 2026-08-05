/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {

    private Node dfs(Node node,Map<Node,Node>map){

        //if no node null obvio
        if(node==null)return null;

        //if it is already visited or present in map ..return tht itself

        if(map.containsKey(node)) return map.get(node);


        //create new copy with node value and store it in map
        Node copy=new Node(node.val);
        map.put(node,copy);

        //for neighbors...copy thm from node to copy recursively
        //node.neighbors is gvn in deftnt of node
        for(Node n:node.neighbors){
            copy.neighbors.add(dfs(n,map));

        }
    return copy;

    }
    
    public Node cloneGraph(Node node) {
        
        //create map here so that it wil remember already visited node n doesnt continue infintely
        HashMap<Node,Node>map=new HashMap<>();
        return dfs(node,map);

    }
}