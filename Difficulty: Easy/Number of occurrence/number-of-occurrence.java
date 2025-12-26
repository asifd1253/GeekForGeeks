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

class Solution {
    int binarySearch(int arr[], int target, boolean searchSideFlag){
        int st = 0;
        int end = arr.length-1;
        
        int ans = -1;
        
        while(st <= end){
            int mid = st + (end-st)/2;
            
            if(arr[mid] == target){
                ans = mid;
                
                if(searchSideFlag == true){ //left side if true
                    end = mid-1;
                }else{
                    st = mid+1;
                }
            }else if(arr[mid] < target){
                st = mid+1;
            }else{
                end = mid-1;
            }
        }
        
        return ans;
    }
    int countFreq(int[] arr, int target) {
        // code here
        int firstOccur = binarySearch(arr, target, true);
        int lastOccur = binarySearch(arr, target, false);
        
        if(firstOccur == -1 || lastOccur == -1){
            return 0;
        }
        
        return lastOccur - firstOccur +1;
    }
}
