/*
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int height(Node root) {
        // code here
        if(root == null){
            return -1;
        }
        
        int lh = height(root.left);
        int rh = height(root.right);
        
        return Math.max(lh, rh)+1;
    }
}