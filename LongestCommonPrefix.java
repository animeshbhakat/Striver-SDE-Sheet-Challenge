import java.io.*;
import java.lang.*;
import java.util.*;
public class Solution {
	public static String longestCommonPrefix(String[] arr, int n) {
		if(n == 0){
            return "";
        }
        if(n == 1){
            return arr[0];
        }
        Arrays.sort(arr);
        int end = Math.min(arr[0].length(), arr[n - 1].length());
        int i = 0;
        while(i < end && arr[0].charAt(i) == arr[n - 1].charAt(i)){
            i++;
        }
        String result = "";
        result = arr[0].substring(0, i);
        return result;
	}
}

