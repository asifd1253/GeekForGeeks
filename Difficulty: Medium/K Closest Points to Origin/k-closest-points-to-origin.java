import java.util.*;

class Point implements Comparable<Point>{
    int x;
    int y;
    int distSq;
    
    Point(int x, int y, int distSq){
        this.x = x;
        this.y = y;
        this.distSq = distSq;
    }
    
    @Override
    public int compareTo(Point p2){
        return this.distSq - p2.distSq;
    }
}


class Solution {
    public ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {
        // code here
        PriorityQueue<Point> pq = new PriorityQueue<>();
        
        for(int i=0; i<points.length; i++){
            int distSq = points[i][0]*points[i][0] + points[i][1]*points[i][1];
            pq.add(new Point(points[i][0], points[i][1], distSq));
        }
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        for(int i=0; i<k; i++){
            Point closest = pq.poll();
            int x = closest.x;
            int y = closest.y;
            
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(x);
            temp.add(y);
            
            res.add(temp);
        }
        
        return res;
    }
}