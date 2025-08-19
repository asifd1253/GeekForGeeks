
// User function Template for Java

class Solution {

    public static int smallestSubWithSum(int k, int[] arr) {
        // Your code goes here
        int n = arr.length;
        int winStart = 0;
        // int winEnd = 0;
        int minLen = Integer.MAX_VALUE;
        int curLen = 0;
        int curSum = 0;
        
        // while(winEnd < n){
        //     curSum += arr[winEnd];
        //     if(curSum > k){
        //         curLen = winEnd-winStart+1;
        //         minLen = Math.min(minLen, curLen);
                
        //         while(winStart <= winEnd && curSum > k){
        //             curSum -= arr[winStart];
        //             if(curSum > k){
        //                 curLen = winEnd-winStart+1;
        //                 minLen = Math.min(minLen, curLen);
        //             }
        //             winStart++;
        //         }
        //     }
            
        //     winEnd++;
        // }
        
        for(int winEnd = 0; winEnd < n; winEnd++){
            curSum += arr[winEnd];
            
            while(winStart <= winEnd && curSum > k){
                curSum -= arr[winStart];
                curLen = winEnd - winStart + 1;
                minLen = Math.min(minLen, curLen);
                winStart++;
            }
        }
        
        return (minLen == Integer.MAX_VALUE)?0:minLen;
    }
}
