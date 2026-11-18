/* Structure of a Linked List Node
class Node {
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}*/

class Solution {
    Node divide(Node head) {
        // code here
        Node even = new Node(-1);
        Node evenHead=even;
        Node odd = new Node(-1);
        Node oddHead=odd;
        Node temp=head;
        while(temp!=null){
            if(temp.data%2==0){
                even.next=new Node(temp.data);
                even=even.next;
            }else{
                odd.next=new Node(temp.data);
                odd=odd.next;
            }
            temp=temp.next;
        }
        even.next=oddHead.next;
        return evenHead.next;
    }
}