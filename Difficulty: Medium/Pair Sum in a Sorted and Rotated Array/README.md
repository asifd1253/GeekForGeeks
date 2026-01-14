✅ Problem Recap

We are given a sorted & rotated array arr[],
and a target sum target.

We must check if there exists a pair (arr[i], arr[j]) such that arr[i] + arr[j] = target.

✅ Chosen Example

Let’s take:

arr = [11, 15, 6, 8, 9, 10]
target = 16


This array is sorted but rotated at index 1 (15 > 6).
So our goal is to check if any two numbers sum to 16.

🧩 Step 1 — Find the Break Point
for (int i = 0; i < n - 1; i++) {
    if (arr[i] > arr[i+1]) {
        breakPoint = i;
        break;
    }
}

i	arr[i]	arr[i+1]	arr[i] > arr[i+1]?	breakPoint
0	11	15	❌	-1
1	15	6	✅	1 (breakPoint found)

So, breakPoint = 1.

🧭 Step 2 — Initialize Two Pointers
int left = (breakPoint + 1) % n;   // smallest element
int right = breakPoint;            // largest element

left = (1 + 1) % 6 = 2 → arr[left] = 6
right = 1 → arr[right] = 15


So:

left = 2 (value = 6)
right = 1 (value = 15)

⚙️ Step 3 — Run While Loop

Condition: while (left != right)

🌀 Iteration 1:

Current Pair: (arr[left], arr[right]) → (6, 15)

Sum = 6 + 15 = 21
Compare with target = 16.

→ 21 > 16 ⇒ move right backward.

right = (n + right - 1) % n
right = (6 + 1 - 1) % 6 = 0


Now:

left = 2 (val=6)
right = 0 (val=11)

🌀 Iteration 2:

Pair = (6, 11)
Sum = 6 + 11 = 17
→ 17 > 16 ⇒ move right backward again.

right = (6 + 0 - 1) % 6 = 5


Now:

left = 2 (val=6)
right = 5 (val=10)

🌀 Iteration 3:

Pair = (6, 10)
Sum = 16 ✅

if (arr[left] + arr[right] == target)
    return true;


✔️ Found the pair (6, 10).
→ Function returns true.

✅ OUTPUT
true


Because the pair (6, 10) sums to 16.

🧠 Summary of Logic
Step	Action	Pointer Update
If sum == target	Pair found → return true	—
If sum < target	Move left = (left + 1) % n (next greater)	increase left
If sum > target	Move right = (n + right - 1) % n (next smaller)	decrease right

The modulo % n ensures that the array is treated as circular.

⏱️ Time & Space Complexity
Metric	Complexity
Time	O(n) — at most one full traversal
Space	O(1) — only pointers used
✅ Key Takeaways

The breakPoint divides the array into two parts:
→ arr[0..breakPoint] (largest elements)
→ arr[breakPoint+1..n-1] (smallest elements)

You start pointers at:

left = smallest element (next to breakPoint)

right = largest element (at breakPoint)

Then, move circularly like two-pointer logic in a sorted array.
