// User function Template for Java
class Solution {
    // Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) {
        // code here
        ArrayList<double[]> ratio = new ArrayList<>();
        
        for(int i=0; i<val.size(); i++){
            double rat = (double)val.get(i)/wt.get(i);
            ratio.add(new double[]{i,rat});
        }
        
        ratio.sort((a,b)-> Double.compare(b[1], a[1]));
        
        double result = 0;
        for(double[] item : ratio){
            int index = (int)item[0];
            
            if(capacity >= wt.get(index)){
                capacity -= wt.get(index);
                result = result + val.get(index);
            }else{
                // If only a fraction of the item can fit, take that fraction.
                result = result + (item[1]*capacity);
                break;
            }
        }
        
        return result;
    }
}
