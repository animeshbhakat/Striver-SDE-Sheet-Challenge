import java.io.*;
import java.util.*;
public class Solution {
    public static ArrayList<Integer> printSum(int[] num, int curr, int index, ArrayList<Integer> ans){
        if(index == num.length){
            ans.add(curr);
            return ans;
        }
        printSum(num, curr, index+1, ans);
        printSum(num, curr+num[index], index+1, ans);
        return ans;
    }
    public static ArrayList<Integer> subsetSum(int num[]) {
        ArrayList<Integer> temp = new ArrayList<>();
        temp = printSum(num, 0, 0, temp);
        Collections.sort(temp);
        return temp;
    }

}
