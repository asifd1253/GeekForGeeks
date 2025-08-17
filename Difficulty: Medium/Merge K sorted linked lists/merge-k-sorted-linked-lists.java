/*class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

// arr is an array of Nodes of the heads of linked lists

class Solution {
    // Function to merge K sorted linked list.
    Node mergeKLists(List<Node> arr) {
        // Add your code here.
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)-> a.data - b.data);
        
        for(Node head : arr){
            if(head != null){
                pq.offer(head);
            }
        }
        
        Node dummy = new Node(-1);
        Node tail = dummy;
        
        while(!pq.isEmpty()){
            Node node = pq.poll();
            
            tail.next = node;
            tail = tail.next;
            
            if(node.next != null){
                pq.offer(node.next);
            }
        }
       
        return dummy.next;
    }
}







