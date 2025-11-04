/*
class Node
{
    int data;
    Node right, left;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

class Solution {
    ArrayList<Integer> arr;
    
    void helper1(Node root){
        if(root == null) return;
        
        helper1(root.left);
        arr.add(root.data);
        helper1(root.right);
    }
    
    Node balancedBST(int st, int end){
        if(st > end) return null;
        
        int mid = st + (end - st)/2;
        
        Node root = new Node(arr.get(mid));
        
        root.left = balancedBST(st, mid-1);
        root.right = balancedBST(mid+1, end);
        
        return root;
    }
 
    Node balanceBST(Node root) {
        // Add your code here.
        arr = new ArrayList<>();
        
        helper1(root);
        return balancedBST(0, arr.size()-1);
    }
}