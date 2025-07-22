import java.util.* ;
import java.io.*; 

public class Solution {
	public static String compressTheString(String s) {
		// Write your code here
		StringBuilder str = new StringBuilder();

		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			Integer count = 1;
			while(i+1 < s.length() && s.charAt(i+1) == ch){
				count++;
				i++;
			}

			if(count == 1){
				str.append(ch);
			}else{
				str.append(ch).append(count.toString());
			}
		}

		return str.toString();
	}

}
