import java.util.* ;
import java.io.*; 
/****************************************************************
	
	Following is the structure of the Singly Linked List.
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

****************************************************************/

public class Solution {
	public static LinkedListNode<Integer> removeKthNode(LinkedListNode<Integer> head, int K) {
		if(head == null || K == 0){
            return head;
        }
        
        LinkedListNode<Integer> start = new LinkedListNode<Integer> (-1);
        start.next = head;
        LinkedListNode<Integer> slow = start;
        LinkedListNode<Integer> fast = start;
       
        
        for(int i=1; i<=K; i++){
            fast  = fast.next;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return start.next;
            
	}
}

