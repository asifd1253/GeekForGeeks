// User function Template for Java

class Solution {
    int[][] sortedMatrix(int N, int Mat[][]) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0; i<Mat.length; i++){
            for(int j=0; j<Mat[0].length; j++){
                pq.add(Mat[i][j]);
            }
        }
        
        //Restore the elements
        for(int i=0; i<Mat.length; i++){
            for(int j=0; j<Mat[0].length; j++){
                Mat[i][j] = pq.peek();
                pq.remove();
            }
        }
        
        return Mat;
    }
};