class Solution {
    List<Node> res = new ArrayList<>();
    HashMap<String, Integer> map = new HashMap<>();
    public String dfs(Node root){
        if(root == null) return "#";
        
        String left = dfs(root.left);
        String right = dfs(root.right);
        
        String subTree = root.data + left + right;
        map.put(subTree, map.getOrDefault(subTree, 0)+1);
        
        if(map.get(subTree) == 2){
            res.add(root);
        }
        
        return subTree;
    }
    public List<Node> printAllDups(Node root) {
        // code here
        dfs(root);
        return res;
    }
}
