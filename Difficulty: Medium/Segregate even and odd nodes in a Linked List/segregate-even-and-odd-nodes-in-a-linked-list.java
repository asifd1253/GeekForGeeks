// User function Template for Java

/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node divide(Node head) {
        // code here
        Node even = new Node(-1);
        Node evenTemp = even;
        
        Node odd = new Node(-1);
        Node oddTemp = odd;
        
        Node temp = head;
        while(temp != null){
            Node newNode = new Node(temp.data);
            if(temp.data % 2 == 0){
                evenTemp.next = newNode;
                evenTemp = evenTemp.next;
            }else{
                oddTemp.next = newNode;
                oddTemp = oddTemp.next;
            }
            
            temp = temp.next;
        }
        
        evenTemp.next = odd.next;
        
        head = even.next;
        
        return head;
    }
}