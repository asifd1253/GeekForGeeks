/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    static ArrayList<ArrayList<Integer>> res;
    static void helper(Node root, ArrayList<Integer> path){
        if(root == null) return;
        
        path.add(root.data);
        
        if(root.left == null && root.right == null){
            res.add(new ArrayList<>(path));
        }
        
        helper(root.left, path);
        helper(root.right, path);
        path.remove(path.size()-1);
        
    }
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        res = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        helper(root, path);
        
        return res;
    }
}