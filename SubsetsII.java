import java.io.*;
import java.util.*;
public class Solution {
    public static void findSubsets(int index, int[] arr, ArrayList<Integer> ds, ArrayList<ArrayList<Integer>> ansList){
        ansList.add(new ArrayList<>(ds));
        for(int i = index; i<arr.length; i++){
            if(index != i && arr[i] == arr[i-1]){
                continue;
            }
            ds.add(arr[i]);
            findSubsets(i+1, arr, ds, ansList);
            ds.remove(ds.size() -1);
        }
    }
    public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ansList = new ArrayList<>();
        findSubsets(0, arr, new ArrayList<>(), ansList);
        return ansList;
    }

}
