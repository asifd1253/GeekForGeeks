class Solution {
    public int minCostPath(int[][] mat) {
        // code here
        int totRows = mat.length;
        int totCols = mat[0].length;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[2]-b[2]);   //store in effort increasing order
        
        pq.offer(new int[]{0,0,0});
        
        boolean visited[][] = new boolean[totRows][totCols];
        
        int dx[] = {-1,0,1,0};    //x->direction
        int dy[] = {0,1,0,-1};    //y->direction
        
        while(!pq.isEmpty()){
            int curCell[] = pq.remove();
            int x = curCell[0];
            int y = curCell[1];
            int curEff = curCell[2];
            
            visited[x][y] = true;
            
            if(x == totRows-1 && y == totCols-1){
                return curEff;
            }
            
            for(int i=0; i<4; i++){
                int curX = x + dx[i];
                int curY = y + dy[i];
                
                if(curX >=0 && curX < totRows && curY >= 0 && curY < totCols && !visited[curX][curY]){
                    int curDiff = Math.abs(mat[x][y]-mat[curX][curY]);
                    int maxEff = Math.max(curDiff, curEff);
                    
                    pq.offer(new int[]{curX, curY, maxEff});
                }
            }
        }
        
        return -1;
    }
}
