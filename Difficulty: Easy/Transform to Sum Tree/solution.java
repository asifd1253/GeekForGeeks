/*Complete the Given Function

Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=null;
        right=null;
    }
}*/

class Solution {
    int helper(Node root){
        if(root == null) return 0;
        
        int leftSum = helper(root.left);
        int rightSum = helper(root.right);
        
        int oldValue = root.data;
        
        root.data = leftSum + rightSum;
        
        return root.data + oldValue;
    }
    public void toSumTree(Node root) {
        // add code here.
        helper(root);
    }
}
