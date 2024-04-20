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

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) 
        return null;

        //you only have to make deep copy of the list.
        //don't need to adjust the places

        Node cur = head;
        HashMap<Node, Node> map = new HashMap<>();

        while (cur != null) {
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }

        cur = head;
        while (cur != null) {
            Node n = map.get(cur);
            n.next = map.get(cur.next);
            n.random = map.get(cur.random);
            cur = cur.next;
        }

        return map.get(head);
    }
}