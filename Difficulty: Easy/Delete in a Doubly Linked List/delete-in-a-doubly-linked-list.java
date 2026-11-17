/* Structure of a Doubly Linked List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = prev = null;
    }
}*/

class Solution {
    public Node delPos(Node head, int k) {
        // code here
        Node prev=null;
        Node cur=head;
        
        for(int i=1; i<k; i++){
            prev=cur;
            cur=cur.next;
        }
        
        if(k==1){
            Node newHead = cur.next;
            newHead.prev=null;
            return newHead;
        }
        
        prev.next=cur.next;
        if(cur.next!=null){
            cur.next.prev=prev;
        }
        return head;
    }
}