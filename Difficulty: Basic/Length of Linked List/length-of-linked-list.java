/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int a){
        data = a;
        next = null;
    }
}
*/
class Solution {
    int len;
    public int getCount(Node head) {
        // code here
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        return len;
    }
}