import java.util.*;
import java.io.*;
import java.lang.*;
public class Solution 
{
    public static void findCombinations(int index, ArrayList<Integer> arr, int target, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> ds){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index; i<arr.size(); i++){
            if(i > index && arr.get(i) == arr.get(i-1)){
                continue;
            }
            if(arr.get(i) > target){
                break;
            }
            ds.add(arr.get(i));
            findCombinations(i+1, arr, target-arr.get(i), ans, ds);
            ds.remove(ds.size() -1);
        }
    }
    public static ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> arr, int n, int target)
    {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Collections.sort(arr);
        findCombinations(0, arr, target, ans, new ArrayList<Integer>());
        return ans;
    }
}
