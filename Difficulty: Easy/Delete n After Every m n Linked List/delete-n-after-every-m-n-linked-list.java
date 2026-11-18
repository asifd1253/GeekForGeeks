/* Structure of Linked List Node
class Node
{
  int data;
  Node next;
  Node(int data)
  {
      this.data = data;
      this.next = null;
  }
}*/

class Solution {
    static void linkDelete(Node head, int n, int m) {
        // code here
        Node cur = head;
        
        while(cur!=null){
            for(int i=1; i<m&&cur!=null; i++){
                cur=cur.next;
            }
            
            if(cur==null) break;
            
            Node temp = cur.next;
            for(int i=0; i<n&&temp!=null; i++){
                temp=temp.next;
            }
            
            cur.next=temp;
            cur=temp;
        }
    }
}