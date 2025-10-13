/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class CustomNode{
    Node node;
    int col;
    
    CustomNode(Node node, int col){
        this.node = node;
        this.col = col;
    }
}
class Solution {
    public ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        
        Queue<CustomNode> q = new LinkedList<>();
        
        q.offer(new CustomNode(root, 0));
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while(!q.isEmpty()){
            CustomNode curCustomNode = q.poll();
            Node curNode = curCustomNode.node;
            int col = curCustomNode.col;
            
            if(!map.containsKey(col)){
                map.put(col, curNode.data);
            }
            if(curNode.left != null){
                q.offer(new CustomNode(curNode.left, col-1));
            }
            if(curNode.right != null){
                q.offer(new CustomNode(curNode.right, col+1));
            }
        }
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            res.add(entry.getValue());
        }
        
        return res;
        
    }
}