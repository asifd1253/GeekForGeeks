/*
Structure of Node class is:

class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
*/

class Solution {
    int ans = -1;
    
    int helper(Node root, int k, int node){
        if(root == null) return -1;
        
        if(root.data == node) return 0;
        
        int leftDist = helper(root.left , k, node);
        int rightDist = helper(root.right , k, node);
        
        if(leftDist == -1 && rightDist == -1) return -1;
        
        int max = Math.max(leftDist, rightDist);
        
        if(max+1 == k && ans == -1){
            ans = root.data;
        }
        
        return max+1;
    }
    
    public int kthAncestor(Node root, int k, int node) {
        // Write your code here
        helper(root, k, node);
        
        return ans;
        
    }
}