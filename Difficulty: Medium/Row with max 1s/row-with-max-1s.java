// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int max = Integer.MIN_VALUE;
        
        int res = -1;
        
        int idx = 0;
        for(int curArr[] : arr){
            int count = 0;
            for(int i : curArr){
                if(i == 1) count++;
            }
            
            if(count > max){
                max = count;
                res = idx;
            }
            idx++;
        }
        
        return res;
    }
}