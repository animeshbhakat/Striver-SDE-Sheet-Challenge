/************************************************************

    Following is the TreeNode class structure

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

************************************************************/


public class Solution 
{
    private static int count = 0;
    private static int answer = 0;
	public static int kthSmallest(TreeNode<Integer> root, int k) 
	{
		count = k;
        helper(root);
        return answer;
	}
    public static void helper(TreeNode<Integer> root){
        if(root.left != null){
            helper(root.left);
        }
        count--;
        if(count == 0){
            answer = root.data;
            return;
        }
        if(root.right != null){
            helper(root.right);
        }
    }

}

