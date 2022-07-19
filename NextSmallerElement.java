import java.util.*;
import java.io.*;

public class Solution{
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> answer = new ArrayList<>();
        stack.push(-1);
        for(int i = n-1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek() >= arr.get(i)){
                stack.pop();
            }
            answer.add(stack.peek());
            stack.push(arr.get(i));
        }
        Collections.reverse(answer);
        return answer;
    }
}
