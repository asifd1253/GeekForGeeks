// User function Template for Java

class Solution {

    public int findK(int arr[][], int n, int m, int k) {
        // Your code goes here
        int res = -1;
        int counter = 0;
        
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length-1;
        int endCol = arr[0].length-1;
        
        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int i=startCol; i<=endCol; i++){
                res = arr[startRow][i];
                counter++;
                if(counter == k) return res;
            }
            startRow++;
            
            //right
            for(int i=startRow; i<=endRow; i++){
                res = arr[i][endCol];
                counter++;
                if(counter == k) return res;
            }
            endCol--;
            
            //bottom
            if(startRow <= endRow){
                for(int i=endCol; i>=startCol; i--){
                    res = arr[endRow][i];
                    counter++;
                    if(counter == k) return res;
                }
                endRow--;
            }
            
            
            //left
            if(startCol <= endCol){
                for(int i=endRow; i>=startRow; i--){
                    res = arr[i][startCol];
                    counter++;
                    if(counter == k) return res;
                }
                startCol++;
            }
        }
        
        return res;
    }
}