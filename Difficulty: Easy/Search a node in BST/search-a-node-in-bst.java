/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    boolean left;
    boolean right;
    public boolean search(Node root, int key) {
        // code here
        if(root == null) return false;
        
        if(root.data == key) return true;
        
        if(root.data > key){
            left = search(root.left, key);
        }else{
            right = search(root.right, key);
        }
        
        return left || right;
    }
}