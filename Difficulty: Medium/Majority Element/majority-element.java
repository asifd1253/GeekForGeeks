class Solution {
    int majorityElement(int arr[]) {
        // code here
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        
        for(int i=0; i<arr.length; i++){
            int curEle = arr[i];
            if(map.get(curEle) > n/2){
                return arr[i];
            }
        }
        
        return -1;
    }
}