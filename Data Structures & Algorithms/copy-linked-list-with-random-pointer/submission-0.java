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
        HashMap<Node,Node> nodes=new HashMap();

        Node curr=head;

        while(curr!=null){
            Node newNode=new Node(curr.val);
            nodes.put(curr,newNode);
            curr=curr.next;
        }

        curr=head;

        while(curr!=null){
            Node copy= nodes.get(curr);
            copy.next=nodes.get(curr.next);
            copy.random=nodes.get(curr.random);
            curr=curr.next;
        }

        return nodes.get(head);
    }
}
