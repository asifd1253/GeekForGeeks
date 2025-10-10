class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;
        int freq[] = new int[n+1];
        
        for(int i=0; i<n; i++){
            freq[arr[i]]++;
        }
        
        int missing = -1;
        int repeated = -1;
        
        for(int i=1; i<=n; i++){
            if(freq[i] == 0){
                missing = i;
            }else if(freq[i] == 2){
                repeated = i;
            }
        }
        
        res.add(repeated);
        res.add(missing);
        
        return res;
    }
}
