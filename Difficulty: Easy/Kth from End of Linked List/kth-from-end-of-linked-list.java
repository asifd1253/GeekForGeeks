/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        // code here
        if(head == null) return -1;
        
        Node cur = head;
        Node prev = null;
        
        while(cur != null){
            Node newNode = cur.next;
            
            cur.next = prev;
            prev = cur;
            cur = newNode;
        }
        
        Node temp = prev;
        
        for(int i=1; i<k; i++){
            if(temp == null){
                return -1;
            }
            temp = temp.next;
        }
        return temp==null ? -1 : temp.data;
    }
}