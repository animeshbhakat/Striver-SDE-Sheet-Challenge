public class Queue {

    int[] arr;
    int front, rear, count, size;
    Queue() {
        count = 0;
        front = 0; 
        rear=0;
        size = 100001;
        arr = new int[size];
    }

    /*----------------- Public Functions of Queue -----------------*/

    boolean isEmpty() {
        if(count == 0){
            return true;
        }
        return false;
    }

    void enqueue(int data) {
        if(count == size){
            return;
        }
        else{
            arr[rear%size] = data;
            rear++;
            count++;
        }
    }

    int dequeue() {
        if(count == 0){
            return -1;
        }
        else{
            int answer = arr[front];
            arr[front%size] = -1;
            front++;
            count--;
            return answer;
        }

    }

    int front() {
        if(count == 0){
            return -1;
        }
        return arr[front%size];
    }

}

