import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        int  num1 = -1, num2 =  -1, count1 = 0, count2 = 0, length = arr.size();
        for(int i=0; i<length; i++){
            if(arr.get(i) == num1){
                count1++;
            }
            else if(arr.get(i) == num2){
                count2++;
            }
            else if(count1 == 0){
                num1 = arr.get(i);
                count1 = 1;
            }
            else if(count2 == 0){
                num2 = arr.get(i);
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 =0;
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i= 0; i<length; i++){
            if(arr.get(i) == num1){
                count1++;
            }
            else if(arr.get(i) == num2){
                count2++;
            }
        }
        if(count1 > Math.floor(length/3)){
            answer.add(num1);
        }
        if(count2  > Math.floor(length/3)){
            answer.add(num2);
        }
        return answer;
    }
}
