import java.io.*;
import java.util.*;
import java.lang.*;
/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T> 
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) 
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/


public class Solution 
{
    public static String serializeTree(TreeNode<Integer> root)
    {
        if(root == null){
            return "";
        }
        Queue<TreeNode<Integer>> q = new LinkedList<TreeNode<Integer>>();
        StringBuilder res = new StringBuilder();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr == null){
                res.append("-1 ");
                continue;
            }
            res.append(curr.data + " ");
            q.add(curr.left);
            q.add(curr.right);
        }
        return res.toString();
    }
    
    public static TreeNode<Integer> deserializeTree(String str)
    {
        if(str == ""){
            return null;
        }
        Queue<TreeNode<Integer>> q = new LinkedList<TreeNode<Integer>>();
        String[] values = str.split(" ");
        TreeNode<Integer> root = new TreeNode<Integer>(Integer.parseInt(values[0]));
        q.add(root);
        for(int i= 1; i<values.length; i++){
            TreeNode<Integer> curr = q.poll();
            if(!values[i].equals("-1")){
                TreeNode<Integer> left = new TreeNode<Integer>(Integer.parseInt(values[i]));
                curr.left = left;
                q.add(left);
            }
            if(!values[++i].equals("-1")){
                TreeNode<Integer> right = new TreeNode<Integer>(Integer.parseInt(values[i]));
                curr.right = right;
                q.add(right);
            }
        }
        return root;
    }
}

