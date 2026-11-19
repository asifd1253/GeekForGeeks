class Solution {
    public static int getMaxArea(int arr[]) {
        // code here
        int n=arr.length;
        
        Stack<Integer> st=new Stack<>();
        
        int smallerLeft[] = new int[n];
        
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                smallerLeft[i] = -1;
            }else{
                smallerLeft[i] = st.peek();
            }
            
            st.push(i);
        }
        
        st = new Stack<>();
        
        int smallerRight[] = new int[n];
        
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                smallerRight[i] = n;
            }else{
                smallerRight[i] = st.peek();
            }
            st.push(i);
        }
        
        int maxArea = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++){
            int height = arr[i];
            int width = smallerRight[i] - smallerLeft[i] -1;
            
            int curArea = height * width;
            
            maxArea = Math.max(maxArea, curArea);
        }
        
        return maxArea;
    }
}
