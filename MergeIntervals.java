import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        ArrayList<Interval> answer = new ArrayList<Interval>();
        if(intervals.length <= 1){
            for(Interval x : intervals){
                answer.add(x);
            }
            return answer;
        }
        Arrays.sort(intervals, (l1, l2) -> l1.start - l2.start);
        
        Interval newInterval = intervals[0];
        answer.add(newInterval);
        for(Interval x : intervals){
            if(x.start <= newInterval.finish){
                newInterval.finish = Math.max(newInterval.finish, x.finish);
            }
            else{
                newInterval = x;
                answer.add(newInterval);
            }
        }
        
        return answer;
        
        
        
    }
}

