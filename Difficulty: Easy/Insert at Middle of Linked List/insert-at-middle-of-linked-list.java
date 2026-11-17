/* Structure of a linked list node
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
    int len;
    public Node insertInMiddle(Node head, int x) {
        // code here
        Node newNode=new Node(x);
        if(head == null) return newNode;
        
        Node t = head;
        while(t!=null){
            len++;
            t=t.next;
        }
        
        int mid = (len%2==0)?len/2:len/2+1;
        
        Node temp = head;
        
        for(int i=1; i<mid; i++){
            temp = temp.next;
        }
        
        Node tempNext = temp.next;
        
        temp.next = newNode;
        newNode.next = tempNext;
        
        return head;
    }
}