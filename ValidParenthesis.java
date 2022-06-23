import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution {
    public static boolean isValidParenthesis(String expression) {
        Stack<Character> myStack = new Stack<Character>();
        for(char c : expression.toCharArray()){
            if(c == '('){
                myStack.push(')');
            }
            else if(c == '{'){
                myStack.push('}');
            }
            else if(c == '['){
                myStack.push(']');
            }
            else if(myStack.isEmpty() || c != myStack.pop()){
                return false;
            }
        }
        return myStack.isEmpty();
    }
}
