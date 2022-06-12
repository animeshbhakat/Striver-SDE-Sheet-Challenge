import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		int xor = 0;
        int count =0;
        int n = arr.size();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++){
            xor = xor ^ arr.get(i);
            if(xor == x){
                count++;
            }
            if(map.get(xor ^ x) != null){
                count += map.get(xor ^ x);
            }
            if(map.get(xor) != null){
                map.put(xor, map.get(xor) +1);
            }
            else{
                map.put(xor, 1);
            }
        }
        return count;
	}
}
