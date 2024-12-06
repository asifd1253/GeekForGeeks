//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class comp implements Comparator<ArrayList<String>> {
    // override the compare() method
    public int compare(ArrayList<String> a, ArrayList<String> b) {
        String x = "";
        String y = "";
        for (int i = 0; i < a.size(); i++) x += a.get(i);
        for (int i = 0; i < b.size(); i++) y += b.get(i);
        return x.compareTo(y);
    }
}

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] wordList = new String[n];
            for (int i = 0; i < n; i++) {
                wordList[i] = br.readLine().trim();
            }
            String startWord, targetWord;
            startWord = br.readLine().trim();
            targetWord = br.readLine().trim();
            Solution obj = new Solution();
            ArrayList<ArrayList<String>> ans =
                obj.findSequences(startWord, targetWord, wordList);
            if (ans.size() == 0)
                System.out.println(-1);
            else {
                Collections.sort(ans, new comp());
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < ans.size(); i++) {
                    for (int j = 0; j < ans.get(i).size(); j++) {
                        sb.append(ans.get(i).get(j) + " ");
                    }
                    if (i != ans.size() - 1) sb.append("\n");
                }
                System.out.println(sb);
            }
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public ArrayList<String> getNeighbours(String curString,HashSet<String> set){
        ArrayList<String> neighbours = new ArrayList<>();
        for(int i=0; i<curString.length(); i++){
            for(char ch = 'a'; ch <= 'z'; ch++){
                if(ch == curString.charAt(i)){
                    continue;
                }
                String newWord = curString.substring(0,i) + ch + curString.substring(i+1,curString.length());
                if(set.contains(newWord)){
                    neighbours.add(newWord);
                }
            }
        }
        return neighbours;
    }
    public ArrayList<ArrayList<String>> findSequences(String startWord,
                                                      String targetWord,
                                                      String[] wordList) {
        // Code here
        HashSet<String> set = new HashSet<>(Arrays.asList(wordList));
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        if(!set.contains(targetWord)){
            return res;
        }
        
        ArrayList<String> dummy = new ArrayList<>();
        dummy.add(startWord);
        
        Queue<ArrayList<String>> q = new LinkedList<>();
        q.add(dummy);
        
        // if startWord present in set remove it 
        if(set.contains(startWord)){
            set.remove(startWord);
        }
        
        int level = 0;
        int resLevel = -1;
        
        while(!q.isEmpty()){
            HashSet<String> usedWords = new HashSet<>();
            int curLevelSize = q.size();
            // level wise traversal
            for(int i=0; i<curLevelSize; i++){
                ArrayList<String> nodeList = q.remove();
                
                String curString = nodeList.get(nodeList.size()-1);
                if(curString.equals(targetWord)){
                    resLevel = curLevelSize;
                    res.add(nodeList);
                }
                ArrayList<String> neighbours = getNeighbours(curString,set);
                for(String neighbour : neighbours){
                    if(set.contains(neighbour)){
                        nodeList.add(neighbour);
                        q.add(new ArrayList<>(nodeList));
                        nodeList.remove(neighbour);
                        usedWords.add(neighbour);
                    }
                }
                
            }
            
            for(String visited : usedWords){
                set.remove(visited);
            }
            
            if(level == resLevel){
                break;
            }
                
            level++;
        }
        
        return res;
                                                                                                                                  
    }
}































