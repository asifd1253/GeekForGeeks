// Time Complexity : O(n)
class Solution {
    public int optimize(int n,int arr[]){
        // base case
        if(n == 0|| n == 1){
            return n;
        }
        
        if(arr[n] != 0){  //if already calculated
            return arr[n];
        }
        
        arr[n] = optimize(n-1,arr) + optimize(n-2,arr);
        
        return arr[n];
    }
    public int nthFibonacci(int n) {
        // code here
        int arr[] = new int[n+1];
        
        return optimize(n,arr);
    }
}
