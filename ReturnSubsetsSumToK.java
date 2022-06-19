import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution 
{
    public static void findCombinations(int index, ArrayList<Integer> arr, int target, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> ds){
        if(arr.size() == index){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        else{
            ds.add(arr.get(index));
            findCombinations(index+1, arr, target-arr.get(index), ans, ds);
            ds.remove(ds.size() -1);
            findCombinations(index+1, arr, target, ans, ds);
        }
    }
    
    public static ArrayList<ArrayList<Integer>> findSubsetsThatSumToK(ArrayList<Integer> arr, int n, int k) 
	{
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        findCombinations(0, arr, k, ans, new ArrayList<>());
        return ans;
    }
}
