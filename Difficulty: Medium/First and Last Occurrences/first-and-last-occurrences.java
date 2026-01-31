// User function Template for Java

class GFG {
    int firstOccur(int arr[], int x){
        int st = 0;
        int end = arr.length-1;
        
        int idx = -1;
        while(st <= end){
            int mid = st + (end-st)/2;
            
            if(arr[mid] == x){
                idx = mid;
                end = mid-1;
            }else if(x < arr[mid]){
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        
        return idx;
    }
    
    int lastOccur(int arr[], int x){
        int st = 0;
        int end = arr.length-1;
        
        int idx = -1;
        while(st <= end){
            int mid = st + (end-st)/2;
            
            if(arr[mid] == x){
                idx = mid;
                st = mid+1;
            }else if(x < arr[mid]){
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        
        return idx;
    }
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        int firstIdx = firstOccur(arr, x);  //firstOccurence
        int lastIdx = lastOccur(arr, x);  //lastOccurence
        
        ArrayList<Integer> res = new ArrayList<>();
        
        res.add(firstIdx);
        res.add(lastIdx);
        
        return res;
    }
}
