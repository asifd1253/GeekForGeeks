class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int totSum = 0;
        
        for(int i : arr){
            totSum += i;
        }
        
        int ls = 0;
        
        for(int i=0; i<arr.length; i++){
            int rs = totSum - ls - arr[i];
            
            if(ls == rs) return i;
            
            ls += arr[i];
        }
        
        return -1;
    }
}
