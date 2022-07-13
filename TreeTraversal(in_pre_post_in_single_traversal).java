import java.io.*;
import java.lang.*;
import java.util.*;
/************************************************************

	Following is the Binary Tree node structure:

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}

************************************************************/
class Pair{
    BinaryTreeNode node;
    int num;
    Pair(BinaryTreeNode n, int h){
        node = n;
        num = h;
    }
}
public class Solution {
    public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
        Stack<Pair> st = new Stack<Pair>();
        st.push(new Pair(root, 1));
        List<List<Integer>> answer = new ArrayList<>();
        if(root == null){
            return answer;
        }
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        
        while(!st.isEmpty()){
            Pair it = st.pop();
            BinaryTreeNode<Integer> curr = it.node;
            if(it.num == 1){
                pre.add(curr.data);
                it.num++;
                st.push(it);
                
                if(it.node.left != null){
                    st.push(new Pair(curr.left, 1));
                }
            }
            else if(it.num == 2){
                in.add(curr.data);
                it.num++;
                st.push(it);
                
                if(curr.right != null){
                    st.push(new Pair(curr.right, 1));
                }
            }
            else{
                post.add(curr.data);
            }
        }
        
        answer.add(in);
        answer.add(pre);
        answer.add(post);
        
        return answer;
    }
}

