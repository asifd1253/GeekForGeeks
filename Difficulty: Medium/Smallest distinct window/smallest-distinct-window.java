// User function Template for Java

class Solution {
    public int findSubString(String str) {
       // Step 1: Count all unique characters
        Set<Character> uniqueChars = new HashSet<>();
        for (char ch : str.toCharArray()) {
            uniqueChars.add(ch);
        }
        int totalUnique = uniqueChars.size(); // this is our target

        // Step 2: Use HashMap to track characters in the current window
        Map<Character, Integer> windowCount = new HashMap<>();
        int minLen = Integer.MAX_VALUE;

        int left = 0;
        int count = 0; // count of unique characters in window
        for (int right = 0; right < str.length(); right++) {
            char ch = str.charAt(right);
            windowCount.put(ch, windowCount.getOrDefault(ch, 0) + 1);

            // If first time this char is added to window
            if (windowCount.get(ch) == 1) {
                count++;
            }

            // Shrink window if it contains all unique characters
            while (count == totalUnique) {
                minLen = Math.min(minLen, right - left + 1);

                // Try to remove str[left] from window
                char leftChar = str.charAt(left);
                windowCount.put(leftChar, windowCount.get(leftChar) - 1);
                if (windowCount.get(leftChar) == 0) {
                    count--;
                }
                left++;
            }
        }

        return minLen;
    }
}