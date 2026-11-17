/* Structure of Linked List Node
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
    Node reverseList(Node head) {
        // code here
        Node cur = head;
        Node prev = null;
        
        while(cur != null){
            Node newNode = cur.next;
            
            cur.next = prev;
            prev = cur;
            cur = newNode;
        }
        return prev;
    }
}