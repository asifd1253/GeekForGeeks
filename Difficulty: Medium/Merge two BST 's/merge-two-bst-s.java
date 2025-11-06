/*
class Node {
    int data;
    Node left, right;

    public Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> arr1;
    ArrayList<Integer> arr2;
    
    void getInorder(ArrayList<Integer> arr, Node root){
        if(root == null) return;
        
        getInorder(arr, root.left);
        arr.add(root.data);
        getInorder(arr, root.right);
    }
    
    public ArrayList<Integer> merge(Node root1, Node root2) {
        // code here
        arr1 = new ArrayList<>();
        getInorder(arr1, root1);
        
        arr2 = new ArrayList<>();
        getInorder(arr2, root2);
        
        ArrayList<Integer> arr = new ArrayList<>();
        int i=0, j=0;
        while(i < arr1.size() && j < arr2.size()){
            if(arr1.get(i) <= arr2.get(j)){
                arr.add(arr1.get(i++));
            }else{
                arr.add(arr2.get(j++));
            }
        }
        
        while(i < arr1.size()) arr.add(arr1.get(i++));
        while(j < arr2.size()) arr.add(arr2.get(j++));
        
        return arr;
    }
}