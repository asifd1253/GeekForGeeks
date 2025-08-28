class Solution {
    public static int getMaxArea(int arr[]) {
        // your code here
        int maxArea = 0;
        int nsl[] = new int[arr.length];
        int nsr[] = new int[arr.length];
        
        //Next smaller left
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<arr.length; i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            
            if(st.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = st.peek();
            }
            
            st.push(i);
        }
        
        //Next smaller right
        st = new Stack<>();
        
        for(int i=arr.length-1; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            
            if(st.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = st.peek();
            }
            st.push(i);
        }
        
        //Calculate maxArea
        for(int i=0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            
            int area = width * height;
            maxArea = Math.max(area, maxArea);
        }
        
        return maxArea;
    }
}
