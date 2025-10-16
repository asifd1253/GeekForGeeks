// FUNCTION CODE
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

/* Should return minimum distance between a and b
   in a tree with given root*/
class GfG {
    Node lca(Node root, int a, int b){
        if(root == null) return null;
        
        if(root.data == a || root.data == b) return root;
        
        Node leftLca = lca(root.left, a, b);
        Node rightLca = lca(root.right, a, b);
        
        if(leftLca == null) return rightLca;
        if(rightLca == null) return leftLca;
        
        return (leftLca != null && rightLca != null)? root : null;
    }
    
    int dist(Node root, int n){
        if(root == null) return -1;
        
        if(root.data == n) return 0;
        
        int leftDist = dist(root.left, n);
        int rightDist = dist(root.right, n);
        
        if(leftDist == -1 && rightDist == -1){
            return -1;
        }else if(leftDist == -1){
            return rightDist + 1;
        }else{
            return leftDist + 1;
        }
        
    }
    int findDist(Node root, int a, int b) {
        // Your code here
        Node lca = lca(root, a, b);
        
        int aDist = dist(lca, a);
        int bDist = dist(lca, b);
        
        return aDist + bDist;
    }
}