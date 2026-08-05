/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
// learn only hashmap 2 pass n space optimazsd

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        // orignal to copied

        map.put(null, null);
        Node cur = head;
        while (cur != null) {
            Node copyy = new Node(cur.val);
            map.put(cur, copyy);

            cur = cur.next;
        }

        cur = head;
        while (cur != null) {
            Node copyy = map.get(cur);
            copyy.next = map.get(cur.next);
            copyy.random = map.get(cur.random);

            cur = cur.next;
        }
        return map.get(head);
    }
}
