//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[n][m];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			Solution obj = new Solution();
			System.out.println(obj.findK(arr, n, m, k));
		t--;
		
System.out.println("~");
}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
   
	public int findK(int a[][], int n, int m, int k)
	{
	    // Your code goes here
	    int arr[] = new int[n*m];
	    int arrCount =0;
	    
	    int startRow = 0;
	    int startCol = 0;
	    int endRow = n-1;
	    int endCol = m-1;
	    
	    while(startRow <= endRow && startCol <= endCol){
	        //top
	        for(int j=startCol; j<=endCol; j++){
	            arr[arrCount] = a[startRow][j];
	            arrCount++;
	        }
	        startRow++;
	        
	        //right
	        for(int i=startRow; i<=endRow; i++){
	            arr[arrCount] = a[i][endCol];
	            arrCount++;
	        }
	        endCol--;
	        
	        //bottom
	        if(startRow <= endRow){
	            for(int j=endCol; j>=startCol; j--){
    	            arr[arrCount] = a[endRow][j];
    	            arrCount++;
    	        }
    	        endRow--;
	        }
	        
	        //left
	        if(startCol <= endCol){
	            for(int i=endRow; i>=startRow; i--){
	            arr[arrCount] = a[i][startCol];
	            arrCount++;
	        }
	        startCol++;
	        }
	        
	    }
	    
	    return arr[k-1];
	}
	
}