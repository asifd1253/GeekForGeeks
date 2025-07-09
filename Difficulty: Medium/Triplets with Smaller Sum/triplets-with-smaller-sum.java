// User function Template for Java

class Solution {
    long countTriplets(int n, int sum, long arr[]) {
        Arrays.sort(arr);
        long count = 0;
        
        for(int i=0; i<arr.length; i++){
            int left = i+1;
            int right = arr.length-1;
            
            while(left < right){
                if(arr[i] + arr[left] + arr[right] < sum){
                    count = count + (right-left);
                    left++;
                }else{
                    right--;
                }
            }
        }
        
        return count;
    }
}
