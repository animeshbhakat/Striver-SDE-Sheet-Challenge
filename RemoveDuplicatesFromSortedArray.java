import java.util.*;
public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		if(arr.size() == 0){
            return 0;
        }
        int inputIndex = 0;
        for(int i = 1; i < arr.size(); ++i){
            if(arr.get(i) != arr.get(inputIndex)){
                arr.add(++inputIndex, arr.get(i));
            }
        }
        return inputIndex+1;
	}
}
