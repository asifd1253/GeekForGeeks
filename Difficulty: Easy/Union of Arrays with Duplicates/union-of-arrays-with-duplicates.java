class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i<a.length; i++){
            set.add(a[i]);
        }
        
        for(int j=0; j<b.length; j++){
            set.add(b[j]);
        }
        
        return set.size();
    }
}