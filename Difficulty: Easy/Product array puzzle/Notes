🔶 Problem Statement
Given an array arr[], return a new array res[] where:
res[i] = product of all elements of arr[] except arr[i]
✅ Without using division and in O(n) time.

🔷 Example Input
arr = [1, 2, 3, 4]
We want:

res[0] = 2×3×4 = 24
res[1] = 1×3×4 = 12
res[2] = 1×2×4 = 8
res[3] = 1×2×3 = 6

=> Output: [24, 12, 8, 6]
🔶 Approach Explained with Prefix and Suffix Arrays
We'll build:

prefix[i] = product of all elements **before** index i
suffix[i] = product of all elements **after** index i

Then:
res[i] = prefix[i] * suffix[i];

✅ Step-by-step Dry Run
1. Initialize Prefix Array
prefix[0] = 1; // No element before index 0
Now compute rest:

prefix[1] = prefix[0] * arr[0] = 1 * 1 = 1
prefix[2] = prefix[1] * arr[1] = 1 * 2 = 2
prefix[3] = prefix[2] * arr[2] = 2 * 3 = 6

=> prefix = [1, 1, 2, 6]
2. Initialize Suffix Array
suffix[n-1] = 1; // No element after index 3
Now compute rest backwards:

suffix[2] = suffix[3] * arr[3] = 1 * 4 = 4
suffix[1] = suffix[2] * arr[2] = 4 * 3 = 12
suffix[0] = suffix[1] * arr[1] = 12 * 2 = 24

=> suffix = [24, 12, 4, 1]
3. Final Result
res[i] = prefix[i] * suffix[i]
-------------------------------------------------------------
| i | prefix[i] | suffix[i] | res[i] = prefix[i] × suffix[i]|
|---|-----------|-----------|-------------------------------|
| 0 |     1     |     24    |        1 × 24 = 24            |
| 1 |     1     |     12    |        1 × 12 = 12            |
| 2 |     2     |     4     |        2 × 4  = 8             |
| 3 |     6     |     1     |        6 × 1  = 6             |
-------------------------------------------------------------

✅ res = [24, 12, 8, 6]

🧠 Why This Works
Instead of recomputing the product for each index (which would be O(n²)), we:
Precompute all prefix products (left side of i)
Precompute all suffix products (right side of i)
Then multiply for each index.
This makes the solution O(n) time and O(n) space.
