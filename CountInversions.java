import java.util.* ;
import java.io.*; 
public class Solution {
    public static long merge(long[] arr, long[] temp, int left, int mid, int right){
        int i, j, k;
        long invCount = 0;
        i = left;
        j = mid;
        k = left;
        while((i <= mid-1) && j <=right){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
                
                invCount += (mid-i);
            }
        }
        while(i<=mid-1){
            temp[k++] = arr[i++];
        }
        while(j <= right){
            temp[k++] = arr[j++];
        }
        for(i = left; i<=right; i++){
            arr[i] = temp[i];
        }
        return invCount;
    }
    public static long mergeSort(long[] arr, long[] temp, int left, int right){
        int mid;
        long invCount=0;
        if(right > left){
            mid = (left + right)/2;
            invCount += mergeSort(arr, temp, left, mid);
            invCount += mergeSort(arr, temp, mid+1, right);
            
            invCount += merge(arr, temp, left, mid+1, right);
        }
        return invCount;
    }
    public static long getInversions(long arr[], int n) {
        long[] temp = new long[n];
        long answer = mergeSort(arr, temp, 0, n-1);
        return answer;
    }
}
