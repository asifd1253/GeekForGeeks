// User function Template for Java

class Solution {
    int largestSubsquare(char mat[][]) {
        // code here
        int row[][] = new int[mat.length][mat[0].length];
        int col[][] = new int[mat.length][mat[0].length];
        
        int rowCount = 0, colCount = 0;
        for(int r=0; r<mat.length; r++){
            for(int c=0; c<mat[0].length; c++){
                rowCount = mat[r][c] == 'X' ? ++rowCount : 0;
                colCount = mat[c][r] == 'X' ? ++colCount : 0;
                row[r][c] = rowCount;
                col[c][r] = colCount;
            }
        }
        
        int result = 0;
        
        for(int r=mat.length-1; r>=0; r--){
            for(int c=mat[0].length-1; c>=0; c--){
                int size = Math.min(row[r][c], col[r][c]);
                
                while(size > result){
                    if (
                        (r - size + 1) >= 0 &&             // 1️⃣ Top row of the square must be within bounds
                        (c - size + 1) >= 0 &&             // 2️⃣ Left column of the square must be within bounds
                        
                        row[r][c] >= size &&               // 3️⃣ Bottom border: From (r, c - size + 1) to (r, c) has all 'X'
                        col[r][c] >= size &&               // 4️⃣ Right border: From (r - size + 1, c) to (r, c) has all 'X'
                        
                        row[r - size + 1][c] >= size &&    // 5️⃣ Top border: From (r - size + 1, c - size + 1) to (r - size + 1, c) has all 'X'
                        col[r][c - size + 1] >= size       // 6️⃣ Left border: From (r - size + 1, c - size + 1) to (r, c - size + 1) has all 'X'
                    )
                        result = size;
                        break;
                    }else{
                        size--;
                    }
                }
            }
        }
        
        return result;
        
    }
};
