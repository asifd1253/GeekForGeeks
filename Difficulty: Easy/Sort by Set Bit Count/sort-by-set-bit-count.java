// User function Template for Java

class Compute {
    static void sortBySetBitCount(Integer arr[], int n) {
        // Your code goes here
        Arrays.sort(arr, (a, b)->{
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);
            
            return Integer.compare(countB, countA);
        });
    }
}
