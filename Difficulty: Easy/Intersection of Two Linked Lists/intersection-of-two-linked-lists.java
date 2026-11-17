/* structure of list node:

class Node
{
    int data;
    Node next;
    Node(int val)
    {
        data=val;
        next=null;
    }
}

*/

class Solution {
    public Node findIntersection(Node head1, Node head2) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        
        Node temp = head2;
        
        while(temp!=null){
            set.add(temp.data);
            temp = temp.next;
        }
        
        temp = head1;
        
        Node res = new Node(-1);
        Node tail = res;
        
        while(temp!=null){
            if(set.contains(temp.data)){
                Node node=new Node(temp.data);
                tail.next = node;
                tail = tail.next;
            }
            temp = temp.next;
        }
        
        return res.next;
    }
}