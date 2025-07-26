/*Complete the function below*/
/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        Node temp = head;
        
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        
        return size;
    }
}