// User function Template for Java

class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        
        int freq[] = new int[n+1];
        
        int repeated = -1;
        int missing = -1;
        
        for(int i=0; i<n; i++){
            freq[arr[i]]++;
        }
        
        for(int j=1; j<=n; j++){
            if(freq[j] == 0){
                missing = j;
            }
            if(freq[j] == 2){
                repeated = j;
            }
        }
        
        res.add(repeated);
        res.add(missing);
        
        return res;
    }
}
