
public class Stack {
    int arr[];
    int cap;
    int top;
    Stack(int c){
        top = -1;
        cap =c;
        arr = new int[cap];
    }
    void push(int num) {
        if(cap - top != 1){
            top++;
            arr[top] = num;
        }
        
    }
    int pop() {
        if(top == -1){
            return -1;
        }
        int res = arr[top];
        top--;
        return res;
    }
    int top() {
        if(top == -1){
            return -1;
        }
        int x = arr[top];
        return x;
    }
    int isEmpty() {
        if(top == -1){
            return 1;
        }
        return 0;
    }
    int isFull() {
        if(top == cap - 1){
            return 1;
        }
        return 0;
    }
}

