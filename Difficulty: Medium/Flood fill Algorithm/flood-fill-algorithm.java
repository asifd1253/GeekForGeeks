//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            int[][] image =  new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S2 = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++)
                    image[i][j] = Integer.parseInt(S2[j]);
            }
            String[] S3 = br.readLine().trim().split(" ");
            int sr = Integer.parseInt(S3[0]);
            int sc = Integer.parseInt(S3[1]);
            int newColor = Integer.parseInt(S3[2]);
            Solution obj = new Solution();
            int[][] ans = obj.floodFill(image, sr, sc, newColor);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++)
                    System.out.print(ans[i][j] + " ");
                System.out.println();
            }
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


class Solution
{
    int rows;
    int cols;
    void dfs(int row,int col,int newColor,int curColor,boolean visited[][],int image[][]){
        // out of bound cases
        if(row < 0 || row >= rows || col < 0 || col >= cols || image[row][col] != curColor || visited[row][col]){                                                                                       
            return;
        }
        
        image[row][col] = newColor;
        
        visited[row][col] = true;
        
        // neighbour
        int adj[][] = {{row-1,col},{row,col+1},{row+1,col},{row,col-1}};
        for(int neighbour[] : adj){
            dfs(neighbour[0],neighbour[1],newColor,curColor,visited,image);
        }
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor){
        // Code here 
        rows = image.length;
        cols = image[0].length;
        
        if(image[sr][sc] == newColor){
            return image;
        }
        
        boolean[][] visited = new boolean[rows][cols];
        dfs(sr,sc,newColor,image[sr][sc],visited,image);
        
        return image;
    }
}