class Solution {
    
    String dfs(Node root, HashMap<String, ArrayList<Node>> map){
        if(root == null) return "#";
        
        String left = dfs(root.left, map);
        String right = dfs(root.right, map);
        
        String subTree = left + "#" + right + "#" + root.data;
        ArrayList<Node> ls = map.getOrDefault(subTree, new ArrayList<Node>());
        ls.add(root);
        map.put(subTree, ls);
        
        return subTree;
    }
    public List<Node> printAllDups(Node root) {
        // code here
        List<Node> res = new ArrayList<>();
        HashMap<String, ArrayList<Node>> map = new HashMap<>();
        
        dfs(root, map);
        
        for(Map.Entry<String, ArrayList<Node>> entry : map.entrySet()){
            if(entry.getValue().size() > 1) res.add(entry.getValue().get(0));
        }
        
        return res;
    }
}