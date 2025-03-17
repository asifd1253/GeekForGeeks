//{ Driver Code Starts
// Initial Template for Java

import java.util.*;

public class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            List<Integer> brr = new ArrayList<>();
            List<Integer> crr = new ArrayList<>();

            String input1 = sc.nextLine();
            Scanner ss1 = new Scanner(input1);
            while (ss1.hasNextInt()) {
                arr.add(ss1.nextInt());
            }

            String input2 = sc.nextLine();
            Scanner ss2 = new Scanner(input2);
            while (ss2.hasNextInt()) {
                brr.add(ss2.nextInt());
            }

            String input3 = sc.nextLine();
            Scanner ss3 = new Scanner(input3);
            while (ss3.hasNextInt()) {
                crr.add(ss3.nextInt());
            }

            Solution ob = new Solution();
            List<Integer> res = ob.commonElements(arr, brr, crr);

            if (res.size() == 0) System.out.print(-1);
            for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
            System.out.println();
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        // Code Here
        List<Integer> res = new ArrayList<>();
        
        int i=0, j=0, k=0;
        
        while(i < arr1.size() && j < arr2.size() && k < arr3.size()){
            if(arr1.get(i).equals(arr2.get(j)) && arr2.get(j).equals(arr3.get(k))){
                if(res.isEmpty() || !res.get(res.size()-1).equals(arr1.get(i))){
                    res.add(arr1.get(i));
                    while(i+1 < arr1.size() && arr1.get(i).equals(arr1.get(i+1))) i++;
                    while(j+1 < arr2.size() && arr2.get(j).equals(arr2.get(j+1))) j++;
                    while(k+1 < arr3.size() && arr3.get(k).equals(arr3.get(k+1))) k++;
                    
                    i++;
                    j++;
                    k++;
                }
            }else if(arr1.get(i) < arr2.get(j)){
                i++;
            }else if(arr2.get(j) < arr3.get(k)){
                j++;
            }else{
                k++;
            }
        }
        
        if(res.isEmpty()){
            res.add(-1);
        }
        
        return res;
    }
}