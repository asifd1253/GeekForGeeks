/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        Node slow=head;
        Node fast=head;
        
        if(head==null || head.next==null){
            return true;
        }
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        Node prev=null;
        Node cur = slow;
        Node curNext = null;
        
        while(cur!=null){
            curNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        
        Node left = head;
        Node right = prev;
        
        while(right != null){
            if(left.data != right.data) return false;
            
            left = left.next;
            right = right.next;
        }
        return true;
    }
}