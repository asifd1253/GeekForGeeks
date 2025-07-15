<h2><a href="https://www.geeksforgeeks.org/problems/largest-subsquare-surrounded-by-x0558/1">Largest subsquare surrounded by X</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a square matrix<strong> mat[][]</strong>, where each cell can be either '<strong>X</strong>' or '<strong>O</strong>', you need to find the size of the <strong>largest square subgrid</strong> that is completely surrounded by '<strong>X</strong>'. More formally you need to find the largest square within the grid where all its <strong>border cells are 'X'</strong>.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>mat[][] = [[X,X],[X,X]]
<strong>Output: </strong>2
<strong>Explanation: </strong>The largest square submatrix surrounded by X is the whole input matrix.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>mat[][] = [[X,X,X,O],[X,O,X,X],[X,X,X,O],[X,O,X,X]]
<strong>Output: </strong>3
<strong>Explanation:</strong>
Here,the input represents following 
matrix of size 4 x 4
<strong>X</strong> <strong>X</strong> <strong>X</strong> O
<strong>X</strong> O <strong>X</strong> X
<strong>X</strong> <strong>X</strong> <strong>X</strong> O
X O X X
The square submatrix starting at (0,0) and ending at (2,2) is the largest submatrix surrounded by X. Therefore, size of that matrix would be 3.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= mat.size() &lt;= 1000<br></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>D-E-Shaw</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Matrix</code>&nbsp;<code>Data Structures</code>&nbsp;