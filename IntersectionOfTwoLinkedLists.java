import java.util.* ;
import java.io.*; 
/************************************
	 
	 //Following is the class structure of the LinkedListNode class:
	 
	  class LinkedListNode<T> {
		public T data;
		public LinkedListNode<T> next;
		
		public LinkedListNode(T data) {
			this.data = data;
			this.next = null;
		}
	}

*****************************************/
public class Solution {

	public static int findIntersection(LinkedListNode<Integer> firstHead, LinkedListNode<Integer> secondHead) {
		if(firstHead == null || secondHead == null){
            return -1;
        }
        LinkedListNode<Integer> a =firstHead;
        LinkedListNode<Integer> b = secondHead;
        
        while(a != b){
            if(a == null){
                a = secondHead;
            }
            else{
                a = a.next;
            }
            if(b == null){
                b = firstHead;
            }
            else{
                b = b.next;
            }
        }
        if( a == null){
            return -1;
        }
        return a.data;
	}
}
