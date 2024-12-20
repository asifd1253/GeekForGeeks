//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      List<List<String>> accounts=new ArrayList<>();
      for (int i = 0; i < n; i++)
       {
        ArrayList<String> temp=new ArrayList<>();
        int x=sc.nextInt();
        for(int j = 0; j < x; j++)
           {
             String s1=sc.next();
             temp.add(s1);
           }
        accounts.add(temp);
       }
      Solution obj = new Solution();
      List<List<String>> res = obj.accountsMerge(accounts);
      Collections.sort(res, new Comparator<List<String>>() {
                @Override   public int compare(List<String> a,
                                              List<String> b) {
                    int al = a.size();
                    int bl = b.size();
                    int min = Math.min(al, bl);
                    for (int i = 0; i < min; i++) {
                        String xx=a.get(i);
                        String yy=b.get(i);
                        if (xx.compareTo(yy)<0)
                            return -1;
                        else if (xx.compareTo(yy)>0)
                            return 1;
                    }
                    if (al < bl)
                        return -1;
                    else if (al > bl)
                        return 1;
                    return -1;
                }
            });
      System.out.print("[");
      for (int i = 0; i < res.size(); ++i)
        {
          System.out.print("[");
          for (int j = 0; j < res.get(i).size(); j++)
             {
                if (j != res.get(i).size() - 1)
                     System.out.print(res.get(i).get(j)+", ");
                else
                     System.out.print(res.get(i).get(j));
             }
          if (i != res.size() - 1)
             System.out.println("], ");
          else
             System.out.print("]");
        }
       System.out.println("]");
    
System.out.println("~");
}
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    public static void dfs(String srcEmail,HashSet<String> visited,HashMap<String,List<String>> adjMap,List<String> subList){
        visited.add(srcEmail);
        subList.add(srcEmail);
        if(!adjMap.containsKey(srcEmail)){
            return ;
        }
        
        for(String neighbour : adjMap.get(srcEmail)){
            if(!visited.contains(neighbour)){
                dfs(neighbour,visited,adjMap,subList);
            }
        }
    }
  static List<List<String>> accountsMerge(List<List<String>> accounts) {
    // code here
    HashMap<String,List<String>> adjMap = new HashMap<>();
    for(List<String> account : accounts){
        String firstEmail = account.get(1);
        for(int i=2; i<account.size(); i++){
            String email = account.get(i);
            if(!adjMap.containsKey(firstEmail)){
                adjMap.put(firstEmail,new ArrayList<>());
            }
            adjMap.get(firstEmail).add(email);
            
            if(!adjMap.containsKey(email)){
                adjMap.put(email,new ArrayList<>());
            }
            adjMap.get(email).add(firstEmail);
        }
    }
    
    List<List<String>> res = new ArrayList<>();
    HashSet<String> visited = new HashSet<>();
    
    for(List<String> account : accounts){
        String firstEmail = account.get(1);
        if(!visited.contains(firstEmail)){
            List<String> subList  = new ArrayList<>();
            dfs(firstEmail,visited,adjMap,subList);
            Collections.sort(subList);
            subList.add(0,account.get(0));
            res.add(subList);
        }
    }
    return res;
  }
}
     