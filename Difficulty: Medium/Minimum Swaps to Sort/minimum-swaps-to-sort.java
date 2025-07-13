class Solution {
    // Function to find the minimum number of swaps required to sort the array.
    public void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
    public int minSwaps(int arr[]) {
        // Code here
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], i);
        }
        
        Arrays.sort(arr);
        
        int i = 0;
        int count = 0;
        
        while(i < arr.length){
            if(i != map.get(arr[i])){
                count++;
                swap(arr, i, map.get(arr[i]));
            }else{
                i++;
            }
        }
        
        return count;
    }
}