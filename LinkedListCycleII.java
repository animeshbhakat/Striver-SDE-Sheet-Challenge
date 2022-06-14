import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

        class Node
		{
		    public int data;
		    public Node next;

		    Node(int data)
		    {
		        this.data = data;
		        this.next = null;
		    }
		}

*****************************************************************/

public class Solution 
{
    public static Node firstNode(Node head) 
    {
        if(head == null || head.next == null){
            return null;
        }
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;
        while(slow != null && fast != null){
            slow = slow.next;
            if(fast.next == null){
                return null;
            }
            fast = fast.next.next;
            if(slow == fast){
                isCycle = true;
                break;
            }
        }
        if(!isCycle){
            return null;
        }
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
