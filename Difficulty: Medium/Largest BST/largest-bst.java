// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }

class Info{
    boolean flag;
    int size;
    int min;
    int max;
    
    public Info(boolean flag, int size, int min, int max){
        this.flag = flag;
        this.size = size;
        this.min = min;
        this.max = max;
    }
}



class Solution {
    static int largestBSTsize;
    
    static Info largestBST(Node root){
        if(root == null){
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);
        
        int curSize = leftInfo.size + rightInfo.size + 1;
        int curMin = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int curMax = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));
        
        //check for is valid BST conditions
        if(root.data <= leftInfo.max || root.data >= rightInfo.min){
            return new Info(false, curSize, curMin, curMax);
        }
        
        if(leftInfo.flag && rightInfo.flag){
            largestBSTsize = Math.max(largestBSTsize, curSize);
            return new Info(true, curSize, curMin, curMax);
        }
        
        return new Info(false, curSize, curMin, curMax);
    }

    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root) {
        // Write your code here
        largestBSTsize = 0;
        largestBST(root);
        
        return largestBSTsize;
    }
}