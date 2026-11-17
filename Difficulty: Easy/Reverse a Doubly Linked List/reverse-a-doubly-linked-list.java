/* Structure of Doubly Linked List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        Node prev=null;
        Node cur=head;
        Node curNext=null;
        
        while(cur!=null){
            curNext=cur.next;
            cur.next=prev;
            cur.prev=curNext;
            prev=cur;
            cur=curNext;
        }
        head=prev;
        return head;
    }
}
