/*
Structure of node class is:
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        // Code here
        Node newNode = new Node(x);
        if(head == null){
            return newNode;
        }
        
        Node slow = head;
        Node fast = head;
        
        //          odd case              even case
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node temp = slow.next;
        slow.next = newNode;
        newNode.next = temp;
        
        
        return head;
        
    }
}