import java.util.*;
public class Solution {
    public static List<String> findPermutations(String s) {
        return generatePermutations("", s);
    }
    public static List<String> generatePermutations(String p, String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char c = up.charAt(0);
        List<String> list = new ArrayList<>();
        for(int i = 0; i<=p.length(); i++){
            String a = p.substring(0, i);
            String b = p.substring(i);
            list.addAll(generatePermutations(a+c+b, up.substring(1)));
        }
        return list;
    }
}
    
