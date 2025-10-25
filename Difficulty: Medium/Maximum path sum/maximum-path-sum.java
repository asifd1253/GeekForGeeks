/*
class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    int maxSum = 0;
    
    int dfs(Node root){
        if(root == null) return 0;
        
        int leftMax = Math.max(dfs(root.left), 0);
        int rightMax= Math.max(dfs(root.right), 0);
        
        maxSum = Math.max(maxSum, root.data+leftMax+rightMax);
        
        return root.data + Math.max(leftMax, rightMax);
    }
    int findMaxSum(Node root) {
        // code here
        maxSum = root.data;
        dfs(root);
        return maxSum;
    }
}