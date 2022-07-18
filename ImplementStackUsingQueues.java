(Using two Queue)

import java.lang.*;
import java.io.*;
import java.util.*;

public class Stack {

    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    int currSize;
    
    public Stack() {
        currSize = 0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        return currSize;
    }

    public boolean isEmpty() {
        if(currSize == 0){
            return true;
        }
        return false;
    }

    public void push(int element) {
        currSize++;
        q2.add(element);
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.remove();
        }
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }

    public int pop() {
         if(q1.isEmpty()){
             return -1;
         }
        int x = q1.remove();
        currSize--;
        return x;
    }

    public int top() {
        if(q1.isEmpty()){
            return -1;
        }
        return q1.peek();
    }
}


(Using Single Queue)


import java.lang.*;
import java.io.*;
import java.util.*;
public class Stack {

    Queue<Integer> q = new LinkedList<>();
    
    int currSize;

    public Stack() {
        currSize = 0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        return currSize;
    }

    public boolean isEmpty() {
        if(currSize == 0){
            return true;
        }
        return false;
    }

    public void push(int element) {
        currSize++;
        q.offer(element);
        for(int i = 0; i<currSize - 1; i++){
            q.offer(q.peek());
            q.remove();
        }
    }

    public int pop() {
        if(currSize == 0){
            return -1;
        }
        int x = q.peek();
        q.remove();
        currSize--;
        return x;
    }

    public int top() {
        if(currSize == 0){
            return -1;
        }
        return q.peek();
    }
}
