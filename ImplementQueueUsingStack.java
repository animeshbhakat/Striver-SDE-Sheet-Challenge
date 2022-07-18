import java.io.*;
import java.lang.*;
import java.util.*;
public class Queue {
    Stack<Integer> input;
    Stack<Integer> output;

    Queue() {
        input = new Stack<Integer>();
        output = new Stack<Integer>();
    }

    void enQueue(int val) {
       input.push(val);
    }

    int deQueue() {
        if(output.isEmpty() && input.isEmpty()){
            return -1;
        }
        if(output.isEmpty()){
           while(!input.isEmpty()){
               output.push(input.pop());
           }
       }
        return output.pop();
    }

    int peek() {
        if(output.isEmpty() && input.isEmpty()){
            return -1;
        }
        if(output.isEmpty()){
           while(!input.isEmpty()){
               output.push(input.pop());
           }
       }
        return output.peek();
    }

    boolean isEmpty() {
        return input.isEmpty() && output.isEmpty();
    }
}
