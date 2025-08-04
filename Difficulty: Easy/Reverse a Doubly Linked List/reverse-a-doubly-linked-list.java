/*
class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
        DLLNode prev = null;
        DLLNode curr = head;
        DLLNode nextNode;
        
        while(curr != null){
            nextNode = curr.next;

            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        
        head = prev;
        
        return head;
    }
}