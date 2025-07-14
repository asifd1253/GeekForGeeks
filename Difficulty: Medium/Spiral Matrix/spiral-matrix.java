// User function Template for Java

class Solution {

    public int findK(int arr[][], int n, int m, int k) {
        // Your code goes here
        
        int res[] = new int[n*m];
        int idx = 0;
        
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length-1;
        int endCol = arr[0].length-1;
        
        while(startRow <= endRow && startCol <= endCol){
            //top 
            for(int i=startCol; i<= endCol; i++){
                res[idx++] = arr[startRow][i];
            }
            startRow++;
            
            //right
            for(int i=startRow; i<=endRow; i++){
                res[idx++] = arr[i][endCol];
            }
            endCol--;
            
            // bottom
            if(startRow <= endRow){
                for(int i=endCol; i>=startCol; i--){
                    res[idx++] = arr[endRow][i];
                }
                endRow--;
            }
            
            
            //left
            if(startCol <= endCol){
                for(int i=endRow; i>=startRow; i--){
                    res[idx++] = arr[i][startCol];
                }
                startCol++;    
            }
            
        }
        
        return res[k-1];
    }
}