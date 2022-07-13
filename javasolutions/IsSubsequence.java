package javasolutions;
import java.util.*;

public class IsSubsequence {
    //accepted
    public static boolean isSubsequence(String s, String t) {
        char[] sarr = s.toCharArray();
        int prevIndex = 0;
        
        if (s.length() == t.length()) {
            return s.equals(t);
        }
        
        for (char c : sarr) {
            if (t.indexOf(c, prevIndex) == -1) {
                return false;
            }
            prevIndex = t.indexOf(c, prevIndex)+1;
        }
        
        return true;
    }

    public static void main(String[] args) {

        String[][] testCases = {{"abc", "ahbgdc"}, {"axc", "ahbgdc"}, {"aaaaaa", "bbaaaa"}, {"bb", "ahbgdc"}};

        for (String[] x : testCases) {
            System.out.println(isSubsequence(x[0], x[1]));
        }
    }
}
