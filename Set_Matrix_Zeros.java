import java.util.* ;
import java.io.*; 
public class Solution {
    public static void setZeros(int matrix[][]) {
        int row = matrix.length;
        int column = matrix[0].length;
        
        boolean[] rowArr = new boolean[row];
        boolean[] columnArr = new boolean[column];
        
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                if(matrix[i][j] == 0){
                    rowArr[i] = true;
                    columnArr[j] = true;
                }
            }
        }
        for(int i=0; i<row; i++){
            for(int j = 0; j< column; j++){
                if(rowArr[i] == true || columnArr[j] == true){
                    matrix[i][j] = 0;
                }
            }
        }
    }

}
