import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
    public static void swap(ArrayList<Integer> permu, int i, int j){
        int temp = permu.get(i);
        permu.set(i, permu.get(j));
        permu.set(j, temp);
    }
    public static void reverse(ArrayList<Integer> permu, int i, int j){
        while(i<j){
            swap(permu,  i++, j--);
        }
    }
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		if(permutation == null || permutation.size() <= 1){
            return permutation;
        }
        int i = permutation.size() -2;
        while(i >= 0 && permutation.get(i) >= permutation.get(i+1)){
            i--;
        }
        if(i >= 0){
            int j = permutation.size() -1;
            while(permutation.get(j) <= permutation.get(i)){
                j--;
            }
            swap(permutation, i, j);
        }
        reverse(permutation, i+1,  permutation.size() - 1);
        
        return permutation;
	}
}

