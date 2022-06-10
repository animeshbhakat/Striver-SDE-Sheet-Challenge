import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findMajority(int[] arr, int n) {
		int res=0, count = 1;
        for(int i= 0; i<n; i++){
            if(arr[res] == arr[i]){
                count++;
            }
            else{
                count--;
            }
            if(count ==0){
                res = i;
                count = 1;
            }
        }
        count = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] == arr[res]){
                count++;
            }
        }
        res = arr[res];
        if(count <= n/2){
            res = -1;
        }
        return res;
	}
}
