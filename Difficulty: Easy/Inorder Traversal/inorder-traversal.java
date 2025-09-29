/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    ArrayList<Integer> res;
    void inorder(Node root){
        if(root == null){
            return;
        }
        
        inorder(root.left);
        res.add(root.data);
        inorder(root.right);
    }
    
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        res = new ArrayList<>();
        inorder(root);
        
        return res;
    }
}