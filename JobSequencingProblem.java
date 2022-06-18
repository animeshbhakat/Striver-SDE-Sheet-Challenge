import java.util.Arrays;
public class Solution
{
    public static int jobScheduling(int[][] jobs)
    {
        Arrays.sort(jobs, (a, b) -> b[1] - a[1]);
        int maxDeadline = 0;
        for(int i=0; i<jobs.length; i++){
            maxDeadline = Math.max(maxDeadline, jobs[i][0]);
        }
        int[] arr = new int[maxDeadline];
        Arrays.fill(arr, -1);
        
        int  maxProfit = 0;
        for(int i = 0; i<jobs.length; i++){
            for(int j = jobs[i][0]; j>0; j--){
                if(arr[j-1] == -1){
                maxProfit += jobs[i][1];
                arr[j-1] = arr[j-1]+1;
                break;
               }
            }
        }
        return maxProfit;
        
    }
}

