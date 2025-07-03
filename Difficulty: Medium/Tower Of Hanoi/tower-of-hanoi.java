class Solution {
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // code here
        if(n == 1){
            return 1;
        }
        
        int move1 = towerOfHanoi(n-1, from, aux, to);
        int move2 = towerOfHanoi(n-1, aux, to, from);
        
        return move1+move2+1;
    }
}
