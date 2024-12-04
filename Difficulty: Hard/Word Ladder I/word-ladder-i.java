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
    public List<String> getNeighbour(String word,HashSet<String> set){
        List<String> neighbours = new ArrayList<>();
        for(int i=0; i<word.length(); i++){
            for(char ch ='a'; ch<='z'; ch++){
                if(ch == word.charAt(i)){
                    continue;
                }
                String newWord = word.substring(0,i)+ch+word.substring(i+1,word.length());
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
        
        if(set.contains(startWord)){
            set.remove(startWord);
        }
        
        int level = 0;
        while(!q.isEmpty()){
            int curLevelSize = q.size();
            // level wise traversal
            for(int i=0; i<curLevelSize; i++){
                String node = q.remove();
                if(node.equals(targetWord)){
                    return level+1;
                }
                List<String> neighbours = getNeighbour(node,set);
                
                for(String neighbour : neighbours){
                    q.add(neighbour);
                    set.remove(neighbour);
                }
            }
            level++;
        }
        
        return 0;
    }
}