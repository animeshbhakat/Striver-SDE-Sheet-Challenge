import java.io.*;
import java.util.*;
import java.lang.*;
public class Solution {

    public static void sortedInsert(Stack<Integer> stack, int num){
        if(stack.isEmpty() || (!stack.isEmpty() && stack.peek() < num)){
            stack.push(num);
            return;
        }
        int n = stack.peek();
        stack.pop();
        sortedInsert(stack, num);
        
        stack.push(n);
    }
	public static void sortStack(Stack<Integer> stack) {
        if(stack.isEmpty()){
            return;
        }
        int num = stack.peek();
        stack.pop();
        
        sortStack(stack);
        
        sortedInsert(stack, num);
	}

}
