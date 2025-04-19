class Solution {
    public double medianOf2(int a[], int b[]) {
        // Your Code Here
        int m = a.length;
        int n = b.length;
        int size = m+n;
        
        int idx1 = (size/2)-1;
        int idx2 = size/2;
        
        int i=0, j=0, k=0;
        
        int ele1 = -1;
        int ele2 = -1;
        
        while(i < m && j < n){
            if(a[i] < b[j]){
                if(k == idx1){
                    ele1 = a[i];
                }
                if(k == idx2){
                    ele2 = a[i];
                }
                i++;
                k++;
            }else{
                if(k == idx1){
                    ele1 = b[j];
                }
                if(k == idx2){
                    ele2 = b[j];
                }
                j++;
                k++;
            }
        }
        
        while(i < m){
            if(k == idx1){
                ele1 = a[i];
            }
            if(k == idx2){
                ele2 = a[i];
            }
            i++;
            k++;
        }
        
        while(j < n){
            if(k == idx1){
                ele1 = b[j];
            }
            if(k == idx2){
                ele2 = b[j];
            }
            j++;
            k++;
        }
        
        if(size%2 != 0){
            return ele2;
        }
        
        return (ele1+ele2)/2.0;
        
    }
}
