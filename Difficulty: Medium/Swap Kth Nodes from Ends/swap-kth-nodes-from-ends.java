/* Linked List Node Structure
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node swapKth(Node head, int k) {
        // code here
        int n=0;
        Node temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        
        if(k>n) return head;
        
        Node prevX=null;
        Node x = head;
        
        for(int i=1; i<k; i++){
            prevX=x;
            x=x.next;
        }
        
        Node prevY=null;
        Node y=head;
        
        for(int i=1; i<=n-k; i++){
            prevY=y;
            y=y.next;
        }
        
        if(prevX!=null){
            prevX.next=y;
        }else{
            head=y;
        }
        
        if(prevY!=null){
            prevY.next=x;
        }else{
            head=x;
        }
        
        Node temp1=x.next;
        x.next=y.next;
        y.next=temp1;
        
        return head;
    }
}
