🟢 Step-by-step Approach:
✅ Step 1: Check Length
If the string has an odd number of characters, it can never be balanced.

Example: "}{{" → length = 3 (odd) → can't be balanced → return -1

✅ Step 2: Use Stack or Counters
We’ll count:

Unmatched opening braces: left

Unmatched closing braces: right

✅ Step 3: Loop Through the String
If you see '{', increase left.

If you see '}':

If there's a '{' waiting (i.e., left > 0), match them (decrease left).

Else, increase right.

✅ Step 4: Count Reversals Needed
Now you have some unmatched:

{ braces (stored in left)

} braces (stored in right)

To fix them:

left unmatched { needs left/2 reversals.

right unmatched } needs right/2 reversals.

If either is odd, then we need to round up → (left + 1)/2 + (right + 1)/2


Input: "}{{}}{{{"

Char: } → No opening before → right = 1
Char: { → left = 1
Char: { → left = 2
Char: } → match with one { → left = 1
Char: } → match with one { → left = 0
Char: { → left = 1
Char: { → left = 2
Char: { → left = 3

Final: left = 3, right = 1
Reversals = (3+1)/2 = 2 + (1+1)/2 = 1 → Total = 3

LET,,,
left = 5
Unmatched opening braces:  { { { { {
                             ↑↑  ↑↑
                            (2 pairs)
                            one extra {
(2+1)/2 = 1.5 → 1 ✅
(3+1)/2 = 2 ✅
(4+1)/2 = 2.5 → 2 ✅
5+1)/2 = 3 ✅
(6+1)/2 = 3.5 → 3 ✅

Convert it into } → but it still needs a partner, so:
- Add one more reversal to make it a pair
