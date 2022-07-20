import java.lang.*;
import java.io.*;
import java.util.*;
import java.math.*;
public class Solution 
{
    public static int compareVersions(String a, String b) 
    {
        if(a.length() == 0){
            return -1;
        }
        if(b.length() == 0){
            return 1;
        }
        String[] level1 = a.split("\\.");
        String[] level2 = b.split("\\.");
        int maxLevel = Math.max(level1.length, level2.length);
        BigInteger a1, a2;
        for(int i = 0; i<maxLevel; i++){
            a1 = i < level1.length ? new BigInteger(level1[i]) : BigInteger.ZERO;
            a2 = i < level2.length ? new BigInteger(level2[i]) : BigInteger.ZERO;
            int compare = a1.compareTo(a2);
            if(compare != 0){
                return compare;
            }
        }
        return 0;
        
    }
}
