import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		long res = arr[0];
        long maxEnding = arr[0];
        for(int i=1; i<n; i++){
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(maxEnding, res);
        }
        if(res < 0){
            res = 0;
        }
        return res;
	}

}

