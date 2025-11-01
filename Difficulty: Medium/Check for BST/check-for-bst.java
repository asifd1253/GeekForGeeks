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
    boolean isValidate(Node root, Node min, Node max){
        if(root == null){
            return true;
        }
        
        if(min != null && root.data <= min.data){
            return false;
        }else if(max != null && root.data >= max.data){
            return false;
        }
        
        return isValidate(root.left, min, root) && isValidate(root.right, root, max);
    }
    public boolean isBST(Node root) {
        // code here
        return isValidate(root, null, null);
    }
}