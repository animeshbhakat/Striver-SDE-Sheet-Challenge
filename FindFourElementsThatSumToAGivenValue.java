import java.util.* ;
import java.io.*; 
public class Solution {
    public static class pair{
        int first, second;
        public pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    
  public static String fourSum(int[] arr, int target, int n) {
      if(arr == null || arr.length == 0){
         return "No";
     }
      HashMap<Integer, pair> map = new HashMap<Integer, pair>();
      for(int i = 0; i<n-1; i++){
          for(int j =i+1; j<n; j++){
              map.put(arr[i] + arr[j], new pair(i, j));
          }
      }
      for(int i=0; i<n-1; i++){
          for(int j = i+1; j<n; j++){
              int sum = arr[i] + arr[j];
              
              if(map.containsKey(target - sum)){
                  pair p = map.get(target - sum);
                  if(p.first != i && p.second != j && p.second != i && p.second != j){
                      return "Yes";
                  }
              }
          }
      }

      return "No";
  }
}

