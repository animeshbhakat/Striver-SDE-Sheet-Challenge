import java.util.* ;
import java.io.*; 
public class Solution {

	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {

	    Arrays.sort(arr);
        
        ArrayList<ArrayList<Integer>> answer = new ArrayList<ArrayList<Integer>>();
        for(int i =0; i<n-2; i++){
            if(i == 0 || (i>0 && arr[i] != arr[i-1])){
                int low = i+1, high = arr.length -1, sum = K - arr[i];
                while(low < high){
                if(sum == arr[low] + arr[high]){
                    answer.add(new ArrayList<>(Arrays.asList(arr[i], arr[low],  arr[high])));
                    while(low < high && arr[low] == arr[low+1]){
                        low++;
                    }
                    while(low < high && arr[high] == arr[high-1]){
                        high--;
                    }
                    low++;
                    high--;
                }
                else if(arr[low] + arr[high] < sum){
                    low++;
                }
                else{
                    high--;
                }
                }
                
            }
        }
        return answer;
	}
}

