class Solution {
    public int countTriplets(int[] arr) {
        // code here
        int n = arr.length;
        
        int count = 0;
        int leftSmallEle[] = new int[n];
        int rightGreatEle[] = new int[n];
        
        for(int i=0; i<n; i++){
            int currEle = arr[i];
            
            for(int j=0; j<i; j++){     //To iterate on left side of a value
                if(currEle > arr[j]){
                    leftSmallEle[i]++;  // Increment inside array element
                }
            }
            
            for(int k=i; k<n; k++){
                if(currEle < arr[k]){
                    rightGreatEle[i]++;
                }
            }
        }
        
        for(int m=0; m<n; m++){
            count = count + (leftSmallEle[m] * rightGreatEle[m]);
        }
        
        return count;
    }
}
