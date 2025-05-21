1. Break the Problem into Subproblems
Before writing any code, let’s identify the smaller tasks we must perform:

Check the overall length of the input string.

An IP address has 4 parts, each at least 1 digit and at most 3 digits → total length must be between 4 and 12.

Choose where to place the three dots.

We will pick 3 indices i, j, k in the string so that:

Part 1 = s[0..i-1]

Part 2 = s[i..j-1]

Part 3 = s[j..k-1]

Part 4 = s[k..end]

Each part must be between length 1 and 3.

Extract each of those four substrings given (i, j, k).

Validate each part:

It is not empty, and has length ≤ 3.

It does not have a leading zero unless it is exactly "0".

Its integer value is between 0 and 255 (inclusive).

If all four parts are valid, combine them with dots and add to the result list.

Return the list of all valid combinations.


YOU CAN UNDERSTAND THE CODE EASILY...
