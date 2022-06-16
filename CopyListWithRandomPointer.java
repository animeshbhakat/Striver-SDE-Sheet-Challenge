import java.util.* ;
import java.io.*; 
/*************************************************************

    Following is the LinkedListNode class structure

    class LinkedListNode<T> {
	    T data;
	    LinkedListNode<T> next;
	    LinkedListNode<T> random;

	    public LinkedListNode(T data) {
		    this.data = data;
	    }
    }

*************************************************************/

public class Solution {
	public static LinkedListNode<Integer> cloneRandomList(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> iter = head;
        LinkedListNode<Integer> front = head;
        
        while(iter != null){
            front  = iter.next;
            LinkedListNode<Integer> copy = new LinkedListNode(iter.data);
            iter.next = copy;
            copy.next = front;
            iter = front;
        }
        iter = head;
        while(iter != null){
            if(iter.random != null){
                iter.next.random = iter.random.next;
            }
            iter = iter.next.next;
        }
        iter = head;
        LinkedListNode<Integer> pseudoNode = new LinkedListNode(-1);
        LinkedListNode<Integer> copy = pseudoNode;
        while(iter != null){
            front = iter.next.next;
            copy.next = iter.next;
            copy = copy.next;
            
            iter.next = front;
            iter = front;
        }
        return pseudoNode.next;
	}
}

