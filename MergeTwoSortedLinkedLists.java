import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		if(first == null){
            return second;
        }
        if(second == null){
            return first;
        }
        if(first.data < second.data){
            first.next = sortTwoLists(first.next, second);
            return first;
        }
        else{
            second.next =  sortTwoLists(first, second.next);
            return second;
        }
	}
}

