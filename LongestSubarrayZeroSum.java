import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		int maximum = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i< arr.size(); i++){
            sum += arr.get(i);
            if(sum == 0){
                maximum = i+1;
            }
            else{
                if(map.get(sum) != null){
                    maximum = Math.max(maximum, i - map.get(sum));
                }
                else{
                    map.put(sum, i);
                }
            }
        }
        return maximum;
	}
}
