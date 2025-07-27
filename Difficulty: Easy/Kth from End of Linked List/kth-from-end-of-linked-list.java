/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {
    int length(Node head){
        int size = 0;
        
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        
        return size;
    }

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        int len = length(head);
        
        if(k > len){
            return -1;
        }
        
        Node temp = head;
        for(int i=0; i<len-k; i++){
            temp = temp.next;
        }
        
        return temp.data;
    }
}