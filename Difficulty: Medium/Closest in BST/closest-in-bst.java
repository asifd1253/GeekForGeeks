/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    static int minDif;
    
    static void helper(Node root, int k){
        if(root == null) return;
        
        minDif = Math.min(minDif, Math.abs(root.data - k));
        
        if(root.data > k){
            helper(root.left, k);
        }else if(root.data < k){
            helper(root.right, k);
        }
    }
    // Function to find the least absolute difference between any node
    // value of the BST and the given integer.
    static int minDiff(Node root, int k) {
        // Write your code here
        minDif = Integer.MAX_VALUE;
        helper(root, k);
        
        return minDif;
    }
}