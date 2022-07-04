public class Solution {
    public static boolean isPossible(int days, int chapters, int[] time, long mid){
        long day = 0;
        long timeAllocated = 0;
        for(int i = 0; i<chapters; i++){
            if(timeAllocated + time[i] > mid){
                day++;
                timeAllocated = time[i];
                if(timeAllocated > mid){
                    return false;
                }
            }
            else{
                timeAllocated += time[i];
            }
        }
        if(day < days){
            return true;
        }
        return false;
    }
    public static long ayushGivesNinjatest(int days, int chapters, int[] time) {
        long low = Integer.MAX_VALUE, high = 0;
        
        for(int i=0; i<chapters; i++){
            high += time[i];
            low = Math.min(low, time[i]);
        }
        long answer = -1;
        while(low <= high){
            long mid = low + (high - low)/2;
            if(isPossible(days, chapters, time, mid)){
                answer = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return answer;
    }
}
