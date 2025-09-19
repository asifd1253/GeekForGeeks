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


===> for condition in loops this is the reason
for(int i=1; i<=3 && i<n-2; i++){
            for(int j=i+1; j<=i+3 && j<n-1; j++){
                for(int k=j+1; k<=j+3 && k<n; k++){

Test Cases Passed: 
2 /404
For Input : 
11211
Your Output:
Hangup (SIGHUP)
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 0 out of bounds for length 0
	at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java: 53)
	at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java: 50)
	at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java: 211)
	at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java: 208)
	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditio...

Its Correct output is:
1.1.2.11
1.1.21.1
1.12.1.1
11.2.1.1

