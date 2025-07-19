// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        
        int idx = -1;
        int max = -1;
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] == 1){
                    count++;
                }
            }
            
            if(count > max){
                max = count;
                idx = i;
            }
        }
        
        return idx;
    }
}