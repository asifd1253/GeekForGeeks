class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        int n = start.length;
       
        int activites[][] = new int[n][2];
        
        for(int i=0; i<n; i++){
                activites[i][0] = start[i];
                activites[i][1] = finish[i];
        }
        
        Arrays.sort(activites, (a,b) -> {
            return a[1] - b[1];
        });
        
        int maxAct = 1;
        int lastAct = activites[0][1];
        
        for(int i=1; i<n; i++){
            if(activites[i][0] > lastAct){
                maxAct++;
                lastAct = activites[i][1];
            }
        }
        
        return maxAct;
    }
}
