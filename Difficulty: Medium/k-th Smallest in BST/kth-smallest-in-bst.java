/*
class Node {
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
    int pos;
    int ans = -1;
    void helper(Node root, int k){
        if(root == null) return;
        
        helper(root.left, k);
        pos++;
        if(pos == k) ans = root.data;
        helper(root.right, k);
    }
    public int kthSmallest(Node root, int k) {
        // code here
        pos = 0;
        helper(root, k);
        
        return ans == -1 ? -1 : ans;
    }
}