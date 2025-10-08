// User function Template for Java

class Solution {

    public static int countNodes(Node root) {
        // Code here
        if(root == null){
            return 0;
        }
        
        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);
        
        int totalCount = leftCount + rightCount + 1;
        
        return totalCount;
    }
}