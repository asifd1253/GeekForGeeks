class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        
        int i=0, j=0;
        
        while(i<a.length && j<b.length){
            if(a[i] <= b[j]){
                arr.add(a[i]);
                i++;
            }else{
                arr.add(b[j]);
                j++;
            }
        }
        
        while(i<a.length){
            arr.add(a[i]);
            i++;
        }
        
        while(j<b.length){
            arr.add(b[j]);
            j++;
        }
        
        return arr.get(k-1);
    }
}