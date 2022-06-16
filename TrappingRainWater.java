import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getTrappedWater(long[] arr, int n) {
       long[] left = new long[n];
       long[] right = new long[n];
       left[0] = arr[0];
        for(int i=1; i<n; i++){
            left[i] = Math.max(left[i-1], arr[i]);
        }
        right[n-1] =arr[n-1];
        for(int i= n-2; i>=0; i--){
            right[i] = Math.max(right[i+1], arr[i]);
        }
        long answer = 0;
        for(int i=0; i<n; i++){
            answer += Math.min(left[i], right[i]) - arr[i];
        }
        return answer;
    }
}

