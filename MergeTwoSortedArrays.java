import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        int i = m-1, j = n-1;
        int arrayLength = m+n-1;
        
        while(i >=0 && j >=0){
            if(arr1[i]  < arr2[j]){
                arr1[arrayLength] = arr2[j];
                j--;
                arrayLength--;
            }
            else{
                arr1[arrayLength] = arr1[i];
                i--;
                arrayLength--;
            }
        }
        while(i>=0){
            arr1[arrayLength] = arr1[i];
            i--;
            arrayLength--;
        }
        while(j>=0){
            arr1[arrayLength] = arr2[j];
            j--;
            arrayLength--;
        }
        return arr1;
    }
}

