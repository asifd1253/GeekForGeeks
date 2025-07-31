/*
The structure of linked list is the following

class Node
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

class Solution {
    static Node findMid(Node head){
        Node slow = head;
        Node fast = head.next;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    static Node merge(Node leftHead, Node rightHead){
        Node dummy = new Node(-1);
        Node temp = dummy;
        
        while(leftHead != null && rightHead != null){
            if(leftHead.data < rightHead.data){
                temp.next = leftHead;
                leftHead = leftHead.next;
            }else{
                temp.next = rightHead;
                rightHead = rightHead.next;
            }
            temp = temp.next;
        }
        
        //Remaining leftHead list
        while(leftHead != null){
            temp.next = leftHead;
            temp = temp.next;
            leftHead = leftHead.next;
        }
        
        //Remaining rightHead list
        while(rightHead != null){
            temp.next = rightHead;
            temp = temp.next;
            rightHead = rightHead.next;
        }
        
        return dummy.next;
    }
    
    // Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head) {
        // add your code here
        if(head == null || head.next == null){
            return head;
        }
        
        Node mid = findMid(head);
        
        Node rightHead = mid.next;
        mid.next = null;
        
        Node newLeftHead = mergeSort(head);
        Node newRightHead = mergeSort(rightHead);
       
        return merge(newLeftHead, newRightHead);
    }
}