🌟 Problem Understanding
You're given a binary string (only 0s and 1s), and your goal is to make it alternate like:

010101... or
101010...

That means no two consecutive characters should be the same.
To do this, you’re allowed to flip (change 0 to 1 or 1 to 0) some bits, and your goal is to minimize the number of flips.

✨ Concept
There are only 2 valid alternating patterns possible for any string:

Pattern 1: starts with '0' → 010101...
Pattern 2: starts with '1' → 101010...

So, we will:
Compare the original string S with both patterns.
Count how many bits need to be flipped in each case.
Return the minimum of the two counts.

class Solution {
    public int minFlips(String S) {
        int flip1 = 0; // To count flips if we start with '0' (Pattern A)
        int flip2 = 0; // To count flips if we start with '1' (Pattern B)

        for (int i = 0; i < S.length(); i++) {
            char expected1 = (i % 2 == 0) ? '0' : '1'; // Pattern A: 0 1 0 1 ...
            char expected2 = (i % 2 == 0) ? '1' : '0'; // Pattern B: 1 0 1 0 ...

            if (S.charAt(i) != expected1) flip1++; // Count if not matching Pattern A
            if (S.charAt(i) != expected2) flip2++; // Count if not matching Pattern B
        }

        return Math.min(flip1, flip2); // Return the minimum flips needed
    }
}

Input: "0001010111"
Pattern A: "0101010101"
Pattern B: "1010101010"

┌─────┬──────┬───────────┬────────┬───────────┬────────┐
│ i   │ S[i] │ Pattern A │ Match? │ Pattern B │ Match? │
├─────┼──────┼───────────┼────────┼───────────┼────────┤
│  0  │  0   │    0      │   ✅   │     1     │   ❌   │
│  1  │  0   │    1      │   ❌   │     0     │   ✅   │
│  2  │  0   │    0      │   ✅   │     1     │   ❌   │
│  3  │  1   │    1      │   ✅   │     0     │   ❌   │
│  4  │  0   │    0      │   ✅   │     1     │   ❌   │
│  5  │  1   │    1      │   ✅   │     0     │   ❌   │
│  6  │  0   │    0      │   ✅   │     1     │   ❌   │
│  7  │  1   │    1      │   ✅   │     0     │   ❌   │
│  8  │  1   │    0      │   ❌   │     1     │   ✅   │
│  9  │  1   │    1      │   ✅   │     0     │   ❌   │
└─────┴──────┴───────────┴────────┴───────────┴────────┘

✅ Flip Count Summary:
Flips for Pattern A = 2 → at indexes 1 and 8
Flips for Pattern B = 8 → almost every alternate bit

✅ Final Answer = min(2, 8) = 2
