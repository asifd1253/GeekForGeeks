/* structure of list Node:

class Node
{
    int data;
    Node next;

    Node(int a)
        {
            data = a;
            next = null;
        }
}

*/

class Solution {
    // Function to find the intersection of two linked lists
    public Node findIntersection(Node head1, Node head2) {
      
        HashSet<Integer> set = new HashSet<>();
        
        Node temp = head2;
        
        while(temp != null){
            set.add(temp.data);
            temp = temp.next;
        }
        
        Node dummy = new Node(-1);
        Node tail = dummy;
        
        temp = head1;
        
        while(temp != null){
            if(set.contains(temp.data)){
                Node newNode = new Node(temp.data);
                tail.next = newNode;
                tail = tail.next;
            }
            temp = temp.next;
        }
        
        return dummy.next;
        
    }
}