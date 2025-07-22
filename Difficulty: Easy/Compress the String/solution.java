import java.util.*;
import java.io.*;

public class Solution {
    public static String compressTheString(String s) {
        // Write your code here
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            Integer count = 1;
            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr.append(s.charAt(i));

            if (count > 1) {
                newStr.append(count.toString());
            }
        }

        return newStr.toString();
    }

}
