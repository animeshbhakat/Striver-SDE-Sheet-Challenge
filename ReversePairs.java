import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static int merge(ArrayList<Integer> arr, int low, int mid, int high){
        int count = 0;
        int j = mid+1;
        for(int i = low; i<=mid; i++){
            while(j<=high && arr.get(i) > 2 * (long)arr.get(j)){
                j++;
            }
            count += (j - (mid+1));
        }
        int left = low;
        int right = mid+1;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        while(left <= mid && right <= high){
            if(arr.get(left) <= arr.get(right)){
                temp.add(arr.get(left++));
            }
            else{
                temp.add(arr.get(right++));
            }
        }
        while(left <= mid){
            temp.add(arr.get(left++));
        }
        while(right <= high){
            temp.add(arr.get(right++));
        }
        for(int i = low; i<=high; i++){
            arr.set(i, temp.get(i-low));
        }
        return count;
    }
    public static int mergeSort(ArrayList<Integer> arr, int low, int high){
        if(low >= high){
            return 0;
        }
        int mid = low + (high - low)/2;
        int inv = mergeSort(arr, low, mid);
        inv += mergeSort(arr, mid+1, high);
        inv += merge(arr, low, mid, high);
        return inv;
    }
    public static int reversePairs(ArrayList<Integer> arr) 
    {
        return mergeSort(arr, 0, arr.size()-1);
    }
}
