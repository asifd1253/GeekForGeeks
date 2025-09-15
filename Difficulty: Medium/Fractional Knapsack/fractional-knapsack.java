class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        int n = val.length;
        
        double ratio[][] = new double[n][2];
        
        for(int i=0; i<n; i++){
            ratio[i][0] = i;
            ratio[i][1] = (double)val[i]/wt[i];
        }
        
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        double maxVal = 0;
        
        for(int i=n-1; i>=0; i--){
            int idx = (int)ratio[i][0];
            if(capacity >= wt[idx]){
                maxVal += val[idx];
                capacity -= wt[idx];
            }else{
                maxVal += ratio[i][1]*capacity;
                break;
            }
        }
        
        return maxVal;
    }
}
