import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        int answer = 0;
        int min = prices.get(0);
        
        for(int i=1; i<prices.size(); i++){
            answer = Math.max(answer, prices.get(i) - min);
            min = Math.min(min, prices.get(i));
        }
        return answer;
    }
}
