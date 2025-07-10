class Solution {
    int minSwap(int[] arr, int k) {
        int n = arr.length;
        
        // Step 1: Count how many elements are <= k (these are favorable elements)
        int windowSize = 0; // This will be the size of our sliding window
        for (int i = 0; i < n; i++) {
            if (arr[i] <= k) {
                windowSize++;
            }
        }

        // Step 2: Count how many unfavorable elements ( > k ) are in the initial window
        int badCount = 0;
        for (int i = 0; i < windowSize; i++) {
            if (arr[i] > k) {
                badCount++;
            }
        }

        // Step 3: Slide the window and find the minimum badCount in any such window
        int minSwaps = badCount; // Minimum swaps needed
        int start = 0;
        int end = windowSize;

        while (end < n) {
            // If the new incoming element is unfavorable, increase badCount
            if (arr[end] > k) {
                badCount++;
            }

            // If the outgoing element (from the left of the window) was unfavorable, decrease badCount
            if (arr[start] > k) {
                badCount--;
            }

            // Update minSwaps
            minSwaps = Math.min(minSwaps, badCount);

            // Slide the window
            start++;
            end++;
        }

        return minSwaps;
    }
}
