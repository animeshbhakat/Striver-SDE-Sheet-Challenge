import java.util.ArrayList;

public class Solution {
	public static int longestSubSeg(ArrayList<Integer> arr , int n, int k) {
		int j = -1;
        int count = 0;
        int answer = 0;
        for(int i=0; i<n; i++){
            if(arr.get(i) == 0){
                count++;           
            }
            while(count > k){
                j++;
                if(arr.get(j) == 0){
                    count--;
                }
            }
            int len = i-j;
            answer = Math.max(len, answer);
        }
        return answer;
	}
}
