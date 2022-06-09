import java.util.ArrayList;

public class Solution {
    
    public static boolean ifFound(ArrayList<Integer> arr, int x){
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) == x){
                return true;
            }
        }
        return false;
    }

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        int xor = arr.get(0);
        int i;
        int[] answer = new int[2];
        //Arrays.fill(answer, -1);
        for(i = 1; i<arr.size(); i++){
            xor = xor ^ arr.get(i);
        }
        for( i=1; i<=n; i++){
            xor = xor ^ i;
        }
        
        int noOfSetBit = xor & ~(xor - 1);
        int x = 0, y = 0;
        for(i =0; i<n; i++){
            if((noOfSetBit & arr.get(i)) != 0){
                x = x ^ arr.get(i);
            }
            else{
                y = y ^ arr.get(i);
            }
        }
        for( i = 1; i<=n; i++){
            if((noOfSetBit & i) !=0){
                x = x ^ i;
            }
            else{
                y = y ^ i;
            }
        }
        
        if(ifFound(arr, x)){
            answer[1] = x;
            answer[0] = y;
        }
        else{
            answer[0] = x;
            answer[1] = y;
        }
        
        
        return answer;
    }
}
