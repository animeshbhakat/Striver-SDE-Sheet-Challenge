import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution {
    public static boolean canPlace(int[] arr, int n, int players, int distance){
        
        int coordinate = arr[0], count = 1;
        for(int i =1; i<n; i++){
            if(arr[i] - coordinate >= distance){
                count++;
                coordinate = arr[i];
            }
            if(count == players){
                return true;
            }
        }
        return false;
    }

    public static int chessTournament(int[] positions, int n,  int c) 
	{
        Arrays.sort(positions);
        int low = 1, high = positions[n-1] - positions[0];
        int answer = 0;
        
        while(low <= high){
            int mid = low + (high - low)/2;
            if(canPlace(positions, n, c, mid)){
                answer = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return answer;
    }

}
