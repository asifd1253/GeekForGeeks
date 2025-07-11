class Solution {
    public double findMedian(int[] arr) {
        // Code here.
        Arrays.sort(arr);
        
        int n = arr.length;
        
        if(n % 2 != 0){     //odd number of elements return direct mid
            return arr[n/2];
        }else{              //even number of elements return avg mid of two
            return (arr[n/2]+arr[n/2-1])/2.0;
        }
    }
}
