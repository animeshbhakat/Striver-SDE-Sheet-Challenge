import java.util.* ;
import java.io.*; 
public class Solution{
    public static int[][] pairSum(int[] arr, int s) {
        Arrays.sort(arr);
        int k = 0;
        int count = 0;
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == s){
                    count++;
                }
            }
        }
        int[][] answer = new int[count][2];
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == s){
                    answer[k][0] = arr[i];
                    answer[k][1] = arr[j];
                    k++;
                }
            }
        }
        return answer;
    }
}
