// User function Template for Java

class GFG {
    int search(int arr[], int x, boolean whichSide){
        int st = 0;
        int end = arr.length - 1;
        int ans = -1;
        
        while(st <= end){
            int mid = st + (end-st)/2;
            
            if(arr[mid] == x){
                ans = mid;
                if(whichSide == true){
                    end = mid-1;
                }else{
                    st = mid+1;
                }
            }else if(arr[mid] > x){
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        
        return ans;
    }
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        
        int firstOccur = search(arr, x, true);
        int lastOccur = search(arr, x, false);
        
        res.add(firstOccur);
        res.add(lastOccur);
        
        return res;
    }
}
