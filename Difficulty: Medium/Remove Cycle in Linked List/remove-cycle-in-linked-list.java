/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int val) {
        data = val;
        next = null;
    }
} */
class Solution {
    public static void removeLoop(Node head) {
        // code here
        Node slow=head;
        Node fast=head;
        
        Node pointer=head;
        Node prev = null;
        
        while(fast!=null&&fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                while(pointer != slow){
                    prev=slow;
                    slow=slow.next;
                    pointer=pointer.next;
                }
                
                prev.next=null;
                return;
            }
        }
    }
}