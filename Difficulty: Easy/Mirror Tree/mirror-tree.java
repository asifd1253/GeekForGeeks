/*
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    void mirror(Node root) {
        // code here
        if(root == null) return;
        
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            Node curNode = q.poll();
            
            Node temp = curNode.left;
            curNode.left = curNode.right;
            curNode.right = temp;
            
            if(curNode.left != null) q.offer(curNode.left);
            if(curNode.right != null) q.offer(curNode.right);
            
        }
        
    }
}