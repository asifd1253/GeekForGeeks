Given a string s, count how many palindromic subsequences it has.
A subsequence is a sequence derived by deleting 0 or more characters without changing the order.
A palindromic subsequence is a subsequence that is the same forward and backward.
You need to count all such palindromic subsequences (not just distinct ones)

Input: "aab"
Subsequences:
'a', 'a', 'b', 'aa'
→ All are palindromic → Answer = 4

Input: "aaa"
All palindromic subsequences:
'a', 'a', 'a', 'aa', 'aa', 'aaa'
→ Answer = 6

Step by step:
gap = 0:
dp[0][0] = 1  -> 'a'
dp[1][1] = 1  -> 'a'
dp[2][2] = 1  -> 'b'

     0   1   2
   ┌───┬───┬───┐
 0 │ 1 │   │   │
   ├───┼───┼───┤
 1 │   │ 1 │   │
   ├───┼───┼───┤
 2 │   │   │ 1 │
   └───┴───┴───┘

Substring from i=0 to j=1 → "aa"
Since s[0] == s[1] → matching characters
dp[0][1] = dp[1][1] + dp[0][0] + 1
         = 1 + 1 + 1 = 3
What are they?
"a" (index 0)
"a" (index 1)
"aa"

     0   1   2
   ┌───┬───┬───┐
 0 │ 1 │ 3 │   │
   ├───┼───┼───┤
 1 │   │ 1 │   │
   ├───┼───┼───┤
 2 │   │   │ 1 │
   └───┴───┴───┘

Substring from i=0 to j=2 → "aab"
a != b → mismatch

dp[0][2] = dp[1][2] + dp[0][1] - dp[1][1]
         = 2 + 3 - 1 = 4

What are the palindromic subsequences?
'a' (index 0)
'a' (index 1)
'b' (index 2)
'aa'

     0   1   2
   ┌───┬───┬───┐
 0 │ 1 │ 3 │ 4 │
   ├───┼───┼───┤
 1 │   │ 1 │ 2 │
   ├───┼───┼───┤
 2 │   │   │ 1 │
   └───┴───┴───┘

Case 1: If s[i] == s[j]
dp[i][j] = dp[i+1][j] + dp[i][j-1] + 1

🧩 Think of:
s = a...a
     ^   ^
     i   j

We include:
All palindromes excluding i → dp[i+1][j]
All palindromes excluding j → dp[i][j-1]
+1 new one: 'a' + (middle palindromes) + a' → at least 'aa'

Case 2: If s[i] != s[j]
dp[i][j] = dp[i+1][j] + dp[i][j-1] - dp[i+1][j-1]

Imagine:
s = a...b
     ^   ^
     i   j

You take:
Palindromes without left → dp[i+1][j]
Palindromes without right → dp[i][j-1]
But you added dp[i+1][j-1] twice → so subtract it once.
This is called inclusion-exclusion principle.

This is the core logic. 
