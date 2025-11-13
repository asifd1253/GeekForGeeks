/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/
class Solution {
    void helper(Node root, ArrayList<Integer> arr){
        if(root == null) return;
        
        helper(root.left, arr);
        arr.add(root.data);
        helper(root.right, arr);
    }
    
    boolean findTarget(Node root, int target) {
        // Write your code here
        ArrayList<Integer> arr = new ArrayList<>();
        helper(root, arr);
        
        int st = 0;
        int end = arr.size()-1;
        
        while(st < end){
            int sum = arr.get(st) + arr.get(end);
            
            if(sum == target) return true;
            
            if(sum < target){
                st++;
            }else{
                end--;
            }
        }
        
        return false;
    }
}