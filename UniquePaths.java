import java.util.* ;
import java.io.*; 
public class Solution {
//     public static int countPaths(int i, int j, int n, int m, int[][] dp){
//         if(i == n-1 && j == m-1){
//             return 1;
//         }
//         if(i >= n || j >= m){
//             return 0;
//         }
//         if(dp[i][j] != -1){
//             return dp[i][j];
//         }
//         else return dp[i][j] = countPaths(i+1, j, n, m, dp) +  countPaths(i, j+1, n, m, dp);
        
//     }
	public static int uniquePaths(int m, int n) {
		int N = m+n-2;
        int r = m-1;
        double answer= 1;
        
        for(int i =1; i<=r; i++){
            answer = answer * (N-r+i)/i;
        }
        return (int) answer;
	}
}
