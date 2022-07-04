import java.util.*;


public class Solution
{
    public static int countSmaller(ArrayList<Integer> arr, int n){
        int low = 0, high = arr.size() -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr.get(mid) <=n){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;
    }
	public static int getMedian(ArrayList<ArrayList<Integer>> matrix)
	{
		int n = matrix.size();
        int m = matrix.get(0).size();
        
        int low = 0;
        int high = (int)1e9;
//         for(int i = 0; i<n; i++){
//             low = Math.min(matrix.get(i).get(0), low);
//             high = Math.max(matrix.get(i).get(n-1), high);
//         }
        while(low <= high){
            int mid = low + (high-low)/2;
            int count = 0;
            for(int i=0; i<n; i++){
                 count += countSmaller(matrix.get(i), mid);
            }
            if(count <= (n*m)/2){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;
        
        
	}
}
