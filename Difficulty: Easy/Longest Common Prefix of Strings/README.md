🧩 Let’s Dry Run Your Code

Input:

arr = ["geeksforgeeks", "geeks", "geek", "geezer"]

Step 1: Initialization
firstString = "geeksforgeeks"

Step 2: i = 1 → curString = "geeks"

Now we check:

!curString.startsWith(firstString)
→ !"geeks".startsWith("geeksforgeeks")
→ !false → true ✅


So we enter the while loop.

We now shorten firstString by removing the last character:

firstString = firstString.substring(0, firstString.length() - 1);


→ "geeksforgeek"
→ "geeksforgee"
→ "geeksforge"
→ "geeksforg"
→ "geeksfor"
→ "geeksf"
→ "geeks"

Now check again:

"geeks".startsWith("geeks") → true


So the condition !true → false — we exit the loop.

✅ Now: firstString = "geeks"

Step 3: i = 2 → curString = "geek"

Check:

!"geek".startsWith("geeks")
→ !"false"
→ true ✅


→ so we shorten "geeks" → "geek"

Now:

!"geek".startsWith("geek") → !true → false


✅ exit loop → firstString = "geek"

Step 4: i = 3 → curString = "geezer"`

Check:

!"geezer".startsWith("geek")
→ !"false" → true ✅


Shrink "geek" → "gee"

Now check again:

!"geezer".startsWith("gee")
→ !"true" → false


✅ Exit loop → firstString = "gee"

✅ Final Output:
"gee"
