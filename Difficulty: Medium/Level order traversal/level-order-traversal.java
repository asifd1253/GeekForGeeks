/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // code here
          ArrayList<ArrayList<Integer>> res = new ArrayList<>();
          
          if(root == null){
              return res;
          }
          
          Queue<Node> q = new LinkedList<>();
          q.add(root);
          
          while(!q.isEmpty()){
              ArrayList<Integer> level = new ArrayList<>();
              
              int size = q.size();
              
              for(int i=0; i<size; i++){
                  Node curNode = q.poll();
                  level.add(curNode.data);
                  
                  if(curNode.left != null) q.add(curNode.left);
                  if(curNode.right != null) q.add(curNode.right);
              }
              
              res.add(level);
          }
          
          return res;
    }
}