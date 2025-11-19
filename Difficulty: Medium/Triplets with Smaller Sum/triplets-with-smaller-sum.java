// User function Template for Java

class Solution {
    long countTriplets(int n, int sum, long arr[]) {
        Arrays.sort(arr);
        
        long res = 0;
        
        for(int i=0; i<arr.length; i++){
            int l = i+1;
            int r = arr.length-1;
            
            while(l < r){
                if(arr[i] + arr[l] + arr[r] < sum){
                    res = res + (r - l);
                    l++;
                }else{
                    r--;
                }
            }
        }
        
        return res;
    }
}
