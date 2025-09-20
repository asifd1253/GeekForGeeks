class Solution {
    public static int minCost(int n, int m, int[] verCost, int[] horCost) {
        // code here
        Arrays.sort(verCost);
        Arrays.sort(horCost);
        
        int v = verCost.length-1;
        int h = horCost.length-1;
        
        int vp = 1;
        int hp = 1;
        
        int cost = 0;
        
        while(v >=0 && h >= 0){
            if(verCost[v] <= horCost[h]){  //horizontal cut
                cost += (horCost[h]*vp);
                hp++;
                h--;
            }else{     //vertical cut
                cost += (verCost[v]*hp);
                vp++;
                v--;
            }
        }
        
        //remaining horizontal cuts
        while(h >= 0){
            cost += (horCost[h]*vp);
            hp++;
            h--;
        }
        
        //remaining vertical cuts
        while(v >= 0){
            cost += (verCost[v]*hp);
            vp++;
            v--;
        }
        
        return cost;
    }
}
