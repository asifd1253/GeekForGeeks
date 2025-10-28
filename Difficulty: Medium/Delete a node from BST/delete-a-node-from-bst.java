/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        
        return root;
    }
    public Node delNode(Node root, int x) {
        // code here
        if(root == null) return null;
        
        if(root.data > x){
            root.left = delNode(root.left, x);
        }else if(root.data < x){
            root.right = delNode(root.right, x);
        }else{
            //1- no child
            if(root.left == null && root.right == null) return null;
            
            //2- single child
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }
            
            //3- 2 or more childs
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delNode(root.right, IS.data);
        }
        
        return root;
    }
}