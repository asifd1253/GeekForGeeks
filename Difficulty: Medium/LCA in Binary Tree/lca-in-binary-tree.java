/*
class Node {
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

class Solution {
    Node lca(Node root, int n1, int n2) {
        // code here
        if(root == null) return null;
        
        if(root.data == n1 || root.data == n2) return root;
        
        Node leftLCA = lca(root.left, n1, n2);
        Node rightLCA = lca(root.right, n1, n2);
        
        if(leftLCA == null) return rightLCA;
        
        if(rightLCA == null) return leftLCA;
        
        return (leftLCA != null && rightLCA != null)?root: null;
    }
}