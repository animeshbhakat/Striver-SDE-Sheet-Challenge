import java.io.*;
import java.util.*;
import java.lang.*;
/*
    Definition of Node class for reference

    class TreeNode<T> 
    {
        public T data;
        public TreeNode<T> left;
        public TreeNode<T> right;

        TreeNode(T data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    }

*/
public class Solution {

    static class BSTIterator{
        Stack<TreeNode<Integer>> myStack = new Stack<>();
        BSTIterator(TreeNode<Integer> root){
            pushAll(root);
        }

        int next(){
            TreeNode<Integer> temp = myStack.pop();
            pushAll(temp.right);
            return temp.data;
        }

        boolean hasNext(){
            return !myStack.isEmpty();
        }
        public void pushAll(TreeNode<Integer> root){
            while(root != null){
                myStack.push(root);
                root = root.left;
            }
        }
    }
}

/*
    Your BSTIterator object will be instantiated and called as such:
    BSTIterator iterator = new BSTIterator(root);
    while(iterator.hasNext())
    {
       print(iterator.next()+" ");
    }
*/

