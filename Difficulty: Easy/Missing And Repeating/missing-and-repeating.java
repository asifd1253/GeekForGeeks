class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n = arr.length;
        
        int freq[] = new int[n+1];
        
        for(int i=0; i<n; i++){
            freq[arr[i]]++;
        }
        
        int missing = -1;
        int repeated = -1;
        
        for(int i=1; i<=n; i++){
            if(freq[i] > 1){
                repeated = i;
            }else if(freq[i] == 0){
                missing = i;
            }
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        
        res.add(repeated);
        res.add(missing);
        
        return res;
    }
}
