class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length+1;
        
        long expSum = (long)n*(n+1)/2;
        
        long curSum = 0;
        
        for(int i : arr){
            curSum += i;
        }
        
        return (int)(expSum - curSum);
    }
}