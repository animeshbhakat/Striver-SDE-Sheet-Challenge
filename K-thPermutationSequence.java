import java.util.*;
import java.io.*;
import java.lang.*;
public class Solution {
    public static String kthPermutation(int n, int k) {
        // Write your code here.
        int fact = 1;
        List<Integer> nums = new ArrayList<>();
        for(int i =1; i<n;  i++){
            fact *= i;
            nums.add(i);
        }
        nums.add(n);
        String answer = "";
        k = k-1;
        while(true){
            answer = answer + nums.get(k/fact);
            nums.remove(k/fact);
            if(nums.size() == 0){
                break;
            }
            k = k%fact;
            fact = fact / nums.size();
        }
        return answer;
    }
}
