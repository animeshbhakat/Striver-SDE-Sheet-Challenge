import java.util.* ;
import java.io.*; 
public class Solution {
    public static int modularExponentiation(int x, int n, int m) {
       long answer = 1;
        long xx = x;
        int nn = n;
        while(nn > 0){
            if(nn % 2 == 1){
                answer = ((answer)%m * (xx)%m) % m;
                nn = nn-1;
            }
            else{
                xx = ((xx%m) * (xx%m))%m;
                nn = nn/2;
            }
        }
        return (int)(answer%m);        
    }
}
