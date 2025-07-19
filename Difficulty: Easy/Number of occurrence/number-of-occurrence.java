class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        
        if(!map.containsKey(target)){
            return 0;
        }
        
        return map.get(target);
    }
}

//  Using 2nd Solution by Binary Search 

// class Solution {
//     int binarySearch(int arr[], int target, boolean searchFirst){
//         int start = 0;
//         int end = arr.length-1;
//         int ans = -1;
        
//         while(start <= end){
//             int mid = start + (end - start)/2;
            
//             if(arr[mid] == target){
//                 ans = mid;
//                 if(searchFirst){
//                     end = mid-1;
//                 }else{
//                     start = mid+1;
//                 }
//             }else if(arr[mid] > target){
//                 end = mid-1;
//             }else{
//                 start = mid+1;
//             }
//         }
        
//         return ans;
//     }
//     int countFreq(int[] arr, int target) {
//         int first = binarySearch(arr, target, true);
//         int last = binarySearch(arr, target, false);
        
//         if(first == -1 || last == -1){
//             return 0;
//         }
//         return last - first +1;
//     }
// }
