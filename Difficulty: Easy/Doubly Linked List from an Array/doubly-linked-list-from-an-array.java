/* class Node {
    int data;
    Node next;
    Node prev;

    Node(int d) {
        data = d;
        next = null;
        prev = null;
    }
} */

class Solution {
    public Node createDLL(int arr[]) {
        // code here
        Node head=new Node(arr[0]);
        Node t=head;
        
        for(int i=1; i<arr.length; i++){
            Node newNode=new Node(arr[i]);
            
            t.next=newNode;
            newNode.prev=t;
            t=newNode;
        }
        return head;
    }
}