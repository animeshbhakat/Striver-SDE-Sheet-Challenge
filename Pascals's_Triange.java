import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
       ArrayList<ArrayList<Long>> res = new ArrayList<ArrayList<Long>>();
        ArrayList<Long> row, prev = null;
        for(int i=0; i<n; i++){
            row = new ArrayList<Long>();
            for(int j=0; j<=i; j++){
                if(j == 0 || j == i){
                    row.add((long)1);
                }
                else{
                    row.add(prev.get(j-1) + prev.get(j));
                }
            }
            prev = row;
            res.add(row);
        }
        return res;
	}
}

