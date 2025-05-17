You are given a Roman numeral string. Your task is to convert it to its equivalent integer.

🏛 Roman Numeral Basics:
Roman	Integer
I	1
V	5
X	10
L	50
C	100
D	500
M	1000

Normally, you add the values from left to right.
BUT... if a smaller value appears before a larger one, you subtract instead of adding.

🧠 Examples:
III → 1 + 1 + 1 = 3
IV → 5 - 1 = 4
IX → 10 - 1 = 9
LVIII → 50 + 5 + 1 + 1 + 1 = 58
MCMIV → 1000 + (1000 - 100) + (5 - 1) = 1904

🧪 Dry Run for Input: "MCMIV"
┌───────┬──────┬──────┬──────────────┬────────────┬──────────────────┬──────────────┬────────┐
│ Index │ s[i] │ Val  │ s[i+1]       │ Val        │ Comparison       │ Action       │ Result │
├───────┼──────┼──────┼──────────────┼────────────┼──────────────────┼──────────────┼────────┤
│   0   │  M   │ 1000 │ C            │ 100        │ 1000 > 100       │ Add 1000     │ 1000   │
│   1   │  C   │ 100  │ M            │ 1000       │ 100 < 1000       │ Subtract 100 │ 900    │
│   2   │  M   │ 1000 │ I            │ 1          │ 1000 > 1         │ Add 1000     │ 1900   │
│   3   │  I   │ 1    │ V            │ 5          │ 1 < 5            │ Subtract 1   │ 1899   │
│   4   │  V   │ 5    │ —            │ —          │ Last character   │ Add 5        │ 1904   │
└───────┴──────┴──────┴──────────────┴────────────┴──────────────────┴──────────────┴────────┘
 Final Answer: 1904

🧪 Dry Run for Input: "IX"
┌───────┬──────┬────┬──────────────┬──────┬──────────────────┬──────────────┬────────┐
│ Index │ s[i] │ Val│ s[i+1]       │ Val  │ Comparison       │ Action       │ Result │
├───────┼──────┼────┼──────────────┼──────┼──────────────────┼──────────────┼────────┤
│   0   │  I   │ 1  │ X            │ 10   │ 1 < 10           │ Subtract 1   │ -1     │
│   1   │  X   │ 10 │ —            │ —    │ Last character   │ Add 10       │ 9      │
└───────┴──────┴────┴──────────────┴──────┴──────────────────┴──────────────┴────────┘
✅ Final Answer: 9

🧪 Dry Run for Input: "XL"
┌───────┬──────┬────┬──────────────┬──────┬──────────────────┬──────────────┬────────┐
│ Index │ s[i] │ Val│ s[i+1]       │ Val  │ Comparison       │ Action       │ Result │
├───────┼──────┼────┼──────────────┼──────┼──────────────────┼──────────────┼────────┤
│   0   │  X   │ 10 │ L            │ 50   │ 10 < 50          │ Subtract 10  │ -10    │
│   1   │  L   │ 50 │ —            │ —    │ Last character   │ Add 50       │ 40     │
└───────┴──────┴────┴──────────────┴──────┴──────────────────┴──────────────┴────────┘
✅ Final Answer: 40

