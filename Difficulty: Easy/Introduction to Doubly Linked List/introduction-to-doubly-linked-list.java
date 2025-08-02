// User function Template for Java

class Solution {
    Node constructDLL(int arr[]) {
       Node head = new Node(arr[0]);
       
       Node curr = head;
       
       for(int i=1; i<arr.length; i++){
           Node temp = new Node(arr[i]);
           
           curr.next = temp;
           temp.prev = curr;
           temp.next = null;
           curr = temp;
       }
       
       return head;
    }
}
