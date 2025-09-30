/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Solution {
    ArrayList<Integer> res;
    
    void postorder(Node root){
        if(root == null){
            return;
        }
        
        postorder(root.left);
        postorder(root.right);
        res.add(root.data);
    }
    // Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root) {
        // Your code goes here
        res = new ArrayList<>();
        
        postorder(root);
        return res;
    }
}