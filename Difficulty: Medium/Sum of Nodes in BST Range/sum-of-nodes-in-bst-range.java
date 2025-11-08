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
    int sum;
    
    void helper(Node root, int l, int r){
        if(root == null) return;
            
        helper(root.left, l, r);
        if(root.data >= l && root.data <= r) sum += root.data;
        helper(root.right, l, r);
        
    }
    
    public int nodeSum(Node root, int l, int r) {
        // code here
        sum = 0;
        helper(root, l, r);
        
        return sum;
    }
}
