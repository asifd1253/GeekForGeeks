class Solution {
    ArrayList<Integer> res;
    public void preOrder(Node root, ArrayList<Integer> res){
        if(root == null){
            return ;
        }
        
        res.add(root.data);
        preOrder(root.left, res);
        preOrder(root.right, res);
    }
    public ArrayList<Integer> preorder(Node root) {
        //  code here
        res = new ArrayList<>();
        
        preOrder(root, res);
        
        return res;
    }
}