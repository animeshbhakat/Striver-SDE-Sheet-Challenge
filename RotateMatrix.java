import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        int up= 0, down = n-1, left = 0, right = m-1;
        if(down == 0 || right == 0){
            return;
        }
        while(left < right && up < down){
            int temp = mat.get(up).get(up);
            for(int i = left+1; i<=right; i++){
                int temp1 = mat.get(up).get(i);
                mat.get(up).set(i, temp);
                temp = temp1;
            }
            for(int j = up+1; j <=down; j++){
                int temp1 = mat.get(j).get(right);
                mat.get(j).set(right, temp);
                temp = temp1;
            }
            for(int i = right-1; i>=left; i--){
                int temp1 = mat.get(down).get(i);
                mat.get(down).set(i, temp);
                temp = temp1;
            }
            for(int j = down-1; j>=up; j--){
                int temp1 = mat.get(j).get(left);
                mat.get(j).set(left, temp);
                temp = temp1;
            }
            up++;
            left++;
            right--;
            down--;
        }
    }
}

