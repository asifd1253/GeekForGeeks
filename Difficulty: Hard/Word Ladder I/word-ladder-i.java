//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] wordList = new String[n];
            for(int i = 0; i < n; i++){
                wordList[i] = br.readLine().trim();
            }
            String startWord, targetWord;
            startWord = br.readLine().trim();
            targetWord = br.readLine().trim();
            Solution obj = new Solution();
            int ans = obj.wordLadderLength(startWord, targetWord, wordList);
            System.out.println(ans);
       
System.out.println("~");
}
    }
}

// } Driver Code Ends


class Solution
{
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
    public int wordLadderLength(String startWord, String targetWord, String[] wordList)
    {
        // Code here
        HashSet<String> set = new HashSet<>(Arrays.asList(wordList));
        if(!set.contains(targetWord)){
            return 0;
        }
        
        Queue<String> q = new LinkedList<>();
        q.add(startWord);
        
        // if startWord present in set remove it 
        if(set.contains(startWord)){
            set.remove(startWord);
        }
        
        int level = 0;
        
        while(!q.isEmpty()){
            int curLevelSize = q.size();
            // level wise traversal
            for(int i=0; i<curLevelSize; i++){
                String curString = q.remove();
                if(curString.equals(targetWord)){
                    return level+1;
                }
                ArrayList<String> neighbours = getNeighbours(curString,set);
                for(String neighbour : neighbours){
                    if(set.contains(neighbour)){
                        q.add(neighbour);
                        set.remove(neighbour);
                    }
                }
            }
            level++;
        }
        
        return 0;
    }
}
















