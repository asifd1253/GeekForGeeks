/*
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Tree {
    ArrayList<Integer> res;
    
    void helper(Node root, ArrayList<Integer> res, int k, int level){
        if(root == null) return;
        
        if(level == k){
            res.add(root.data);
            return;
        }
        
        helper(root.left, res, k, level+1);
        helper(root.right, res, k, level+1);
    }
    // Recursive function to print right view of a binary tree.
    ArrayList<Integer> Kdistance(Node root, int k) {
        // Your code here
        res = new ArrayList<>();
        
        helper(root, res, k, 0);
        
        return res;
    }
}