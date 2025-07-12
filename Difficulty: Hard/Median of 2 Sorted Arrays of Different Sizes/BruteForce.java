class Solution {
    public double medianOf2(int a[], int b[]) {
        // Your Code Here
        ArrayList<Integer> arr = new ArrayList<>();
        
        int left = 0;
        int right = 0;
        
        while(left < a.length && right < b.length){
            if(a[left] <= b[right]){
                arr.add(a[left]);
                left++;
            }else{
                arr.add(b[right]);
                right++;
            }
        }
        
        while(left < a.length){
            arr.add(a[left]);
            left++;
        }
        
        while(right < b.length){
            arr.add(b[right]);
            right++;
        }
        
        int n = arr.size();
        if(n % 2 != 0){
            return arr.get(n/2);
        }else{
            return (arr.get(n/2)+arr.get(n/2-1))/2.0;
        }
    }
}
