class Solution {
    static ArrayList<Integer> res;
    
    static void helper(Node root, int low, int high){
        if(root == null) return;
        
        if(root.data > low) helper(root.left, low, high);
      
        if(root.data >= low && root.data <= high) res.add(root.data);
        
        if(root.data < high) helper(root.right, low, high);
        
    }
    // Function to return a list of BST elements in a given range.
    public static ArrayList<Integer> printNearNodes(Node root, int low, int high) {
        // code here.
        res = new ArrayList<>();
        helper(root, low, high);
        
        return res;
    }
}