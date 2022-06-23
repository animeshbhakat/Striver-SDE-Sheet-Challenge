public class Solution {
    
    public static boolean solve(int[][] matrix){
        for(int i= 0; i<9; i++){
            for(int j = 0; j<9; j++){
                if(matrix[i][j] == 0){
                    for(int c =1; c<=9; c++){
                        if(isValid(matrix, i, j, c)){
                            matrix[i][j] = c;
                            if(solve(matrix)){
                                return true;
                            }
                            else{
                                matrix[i][j] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isValid(int[][] matrix, int row, int column, int  c){
        for(int i  = 0; i<9; i++){
            if(matrix[i][column] == c){
                return false;
            }
            if(matrix[row][i] == c){
                return false;
            }
            if(matrix[3 * (row/3) + i/3][3* (column/3) + i%3] == c){
                return false;
            }
        }
        return true;
    }

	public static boolean isItSudoku(int matrix[][]) {

		return solve(matrix);

	}
}

