package javasolutions;
import java.util.*;

class IsometricStrings {
    //accepted
    public static boolean isIsomorphic(String s, String t) {
        
        Map<String,String> map = new HashMap<String,String>();
        String[] sarr = s.split("");
        String[] tarr = t.split("");
        
        for (int i=0; i<s.length(); i++) {
            if (map.containsKey(sarr[i])) {
                if (!map.get(sarr[i]).equals(tarr[i])) {
                    return false;
                }
            }
            if (!map.containsKey(sarr[i]) && map.values().contains(tarr[i])) {
                return false;
            }
            map.put(sarr[i],tarr[i]);
        }
        
        return true;
    }

    public static void main(String[] args) {
        
        String[][] testCases = {{"egg", "add"}, {"foo", "bar"}, {"paper", "title"}, {"badc", "baba"}};

        for (String[] x : testCases) {
            System.out.println(isIsomorphic(x[0], x[1]));
        }
        

    }
}