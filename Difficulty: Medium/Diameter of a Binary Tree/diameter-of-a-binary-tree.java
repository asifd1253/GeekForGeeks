/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} */

class Solution {
    int height(Node root){
        if(root == null){
            return 0;
        }
        
        int lh = height(root.left);
        int rh = height(root.right);
        
        return Math.max(lh, rh) + 1;
    }
    
    
    public int diameter(Node root) {
        // code here
        if(root == null){
            return 0;
        }
        
        int ld = diameter(root.left);
        int lh = height(root.left);
        
        int rd = diameter(root.right);
        int rh = height(root.right);
        
        int selfDiam = lh+rh;
        
        return Math.max(selfDiam, Math.max(ld, rd));
    }
}