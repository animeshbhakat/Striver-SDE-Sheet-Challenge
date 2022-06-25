import java.lang.*;
import java.io.*;
import java.util.*;
public class Solution {
    public static boolean isSafe(int node, int[][] mat, int[] color, int n, int colChoosen){
        for(int it=0;it<n;it++){
            if(it != node && (mat[it][node] != 0) && color[it] == colChoosen){
                return false;
            }
        }
        return true;
    }
	public static boolean solve(int node, int[][] mat, int[] color, int n, int m){
        if(node == n){
            return true;
        }
        for(int i= 1; i<=m; i++){
            if(isSafe(node, mat, color, n, i)){
                color[node] = i;
                if(solve(node+1, mat, color, n, m) == true){
                    return true;
                }
                color[node] = 0;
            }
        }
        return false;
    }
    public static String graphColoring(int[][] mat, int m) {
		int n = mat.length;
        int[] color = new int[n];
        Arrays.fill(color, 0);
        if(solve(0, mat, color, n, m) == true){
            return "YES";
        }
        return "NO";
	}
}

