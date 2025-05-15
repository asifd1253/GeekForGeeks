Given a matrix of characters, find how many times a word like "SNAKES" appears starting from any cell,
moving up/down/left/right, and allowing 90° bends, but no cell can be reused in the same word path.

✅ Step-by-step Approach:
🔶 Step 1: Recognize this is a DFS-based grid search problem.
When you see:
Matrix/grid

Directions (up, down, left, right)

Finding patterns or paths
➡️ DFS (Depth First Search) is the best choice.

✅ Let's Now Write & Explain the Code

class Solution {
    int R, C; // To hold matrix dimensions globally

📌 Why?
We store R (rows) and C (columns) as global variables to use inside our DFS function easily without passing them every time.

    public int findOccurrence(char[][] mat, String target) {
        R = mat.length;
        C = mat[0].length;
📌 Why?
Get the size of the matrix. This helps for bounds checking while moving in the matrix.

        int count = 0;
📌 Why?
We’ll use this to count how many times we find the word successfully in the matrix.

        boolean[][] visited = new boolean[R][C];
📌 Why?
To track visited cells in the current word path — so that we don’t use the same cell more than once.

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (mat[i][j] == target.charAt(0)) {
                    count += dfs(mat, target, i, j, 0, visited);
                }
            }
        }
📌 Why?
We're looping through every cell of the matrix to find starting points — if it matches the first character of the word (target.charAt(0)).

If it matches, we call the DFS from there and add how many times we can form the word from that point.

        return count;
    }
📌 Why?
Once we've searched from all possible cells, we return the total count.

🌀 The DFS Function

    private int dfs(char[][] mat, String target, int i, int j, int idx, boolean[][] visited) {
📌 Parameters Meaning:
mat → the matrix
target → the word we’re looking for
i, j → current matrix cell
idx → index in the target word (0, 1, 2, …)
visited → to track if this cell is already used

        if (i < 0 || i >= R || j < 0 || j >= C) return 0;
📌 Why?
Check if the current cell is out of matrix bounds — return 0 if it is.

        if (visited[i][j]) return 0;
📌 Why?
Don't reuse a cell in the same word path — if it's already visited, skip it.

        if (mat[i][j] != target.charAt(idx)) return 0;
📌 Why?
If the current cell's character doesn’t match the current target character — return 0.

Note : YOU CAN WRITE ALL return 0 CONDITIONS IN ONE LINE

        if (idx == target.length() - 1) return 1;
📌 Why?
Base case: if we’ve reached the last character of the word, and it matched → we found the word → return 1.

        visited[i][j] = true;
📌 Why?
Mark the cell as visited before exploring further, to avoid loops or repeats.

        int found = 0;
📌 Why?
To store how many successful paths we find from this cell.

        // Explore all 4 directions
        found += dfs(mat, target, i + 1, j, idx + 1, visited); // down
        found += dfs(mat, target, i - 1, j, idx + 1, visited); // up
        found += dfs(mat, target, i, j + 1, idx + 1, visited); // right
        found += dfs(mat, target, i, j - 1, idx + 1, visited); // left
📌 Why?
Try to find the next character of the target in all 4 directions. Each valid path adds to found.

        visited[i][j] = false; // backtrack
📌 Why?
After we’re done with the current path, unmark the cell so it can be used in other starting paths.

        return found;
    }
📌 Why?
Return how many words were found from this DFS path.
