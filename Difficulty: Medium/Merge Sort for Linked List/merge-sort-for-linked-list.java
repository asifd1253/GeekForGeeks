/* Structure of a Linked List node
class Node {
    int data;
    Node next;
    Node(int key) {
        data = key;
        next = null;
    }
} */

class Solution {
    public Node merge(Node head1,Node head2){
        Node ansHead = new Node(-1);
        Node ansTail = ansHead;
        
        while(head1!=null && head2!=null){
            if(head1.data <= head2.data){
                ansTail.next = new Node(head1.data);
                head1=head1.next;
            }else{
                ansTail.next = new Node(head2.data);
                head2=head2.next;
            }
            ansTail = ansTail.next;
        }
        
        while(head1!=null){
            ansTail.next = new Node(head1.data);
            head1=head1.next;
            ansTail = ansTail.next;
        }
        
        while(head2!=null){
            ansTail.next = new Node(head2.data);
            head2=head2.next;
            ansTail = ansTail.next;
        }
        
        ansHead=ansHead.next;
        return ansHead;
    }
    public Node mergeSort(Node head) {
        // code here
        if(head==null || head.next==null){
            return head;
        }
        Node prev = null;
        Node slow = head;
        Node fast = head;
        
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        
        prev.next=null;
        
        Node head1=mergeSort(head);
        Node head2=mergeSort(slow);
        
        return merge(head1, head2);
    }
}