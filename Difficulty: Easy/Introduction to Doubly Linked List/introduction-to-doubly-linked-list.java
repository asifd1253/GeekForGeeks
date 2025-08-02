// User function Template for Java

class Solution {
    Node constructDLL(int arr[]) {
        // Code here
        Node head = new Node(arr[arr.length-1]);
        
        for(int i=arr.length-2; i>=0; i--){
            Node temp = new Node(arr[i]);
            
            temp.next = head;
            head.prev = temp;
            temp.prev = null;
            head = temp;
        }
        
        return head;
    }
}