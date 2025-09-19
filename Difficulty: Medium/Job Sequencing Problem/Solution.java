class Job{
    int deadline;
    int profit;
    
    Job(int d, int p){
        deadline = d;
        profit = p;
    }
}

class Solution {
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        ArrayList<Job> arr = new ArrayList<>();
        
        for(int i=0; i<profit.length; i++){
            arr.add(new Job(deadline[i], profit[i]));
        }
        
        Collections.sort(arr, (a,b)-> b.profit-a.profit);
        
        int maxDeadline = 0;
        
        for(int i : deadline){
            maxDeadline = Math.max(maxDeadline, i);
        }
        
        boolean timeUsed[] = new boolean[maxDeadline+1];
        
        
        int totalJobs = 0;
        int totalProfit = 0;
    
        for(Job job : arr){
            for(int curDeadline = Math.min(maxDeadline, job.deadline); curDeadline>0; curDeadline--){
                if(timeUsed[curDeadline] == false){
                    timeUsed[curDeadline] = true;
                    totalJobs++;
                    totalProfit += job.profit;
                    
                    break;
                }
            }
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        res.add(totalJobs);
        res.add(totalProfit);
        
        return res;
    }
}
