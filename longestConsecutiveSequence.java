import java.util.* ;
import java.io.*; 
public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        int maxStreak = Integer.MIN_VALUE;
        for(int i =0; i<N; i++){
            if(!set.contains(arr[i]-1)){
                int currentNum = arr[i];
                int currentStreak = 1;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    currentStreak++;
                }
                maxStreak = Math.max(maxStreak, currentStreak);
            } 
        }
        return maxStreak;
    }
}
