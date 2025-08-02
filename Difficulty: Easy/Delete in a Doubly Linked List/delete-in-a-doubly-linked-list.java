/*

Definition for doubly Link List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node deleteNode(Node head, int x) {
        // code here
        if(head == null){
            return null;
        }
        
        if(x == 1){
            Node newHead = head.next;
            if(newHead != null){
                newHead.prev = null;
            }
            
            return newHead;
        }
        
        
        
        Node prev = null;
        Node curr = head;
        
        for(int i=1; i<x; ++i){
            prev = curr;
            curr = curr.next;
        }
        
        prev.next = curr.next;
        
        if(curr.next != null){
            curr.next.prev = prev;
        }
       
        return head;
        
    }
}